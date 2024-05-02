import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();// 10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        // recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);

        System.out.println("Mostrar Inverso");

        Mostrar_Inverso(array);

    }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valo [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }

        // Hay que hacer que mire bonito

    }

    // Aqui va el metodo de inverso

    public static void Mostrar_Inverso(int[] a) {

        for (int i : a) {
            System.out.println((i >= 0) ? -i : Math.abs(i));
            //Hacemos una pequeña validacion para comprobar si los numeros de i son mayores, iguales o menores a cero
            //El -i esta hecho para mostrar en negativo los numeros positivos del array
            //El operador Math.abs se encarga de tomar los valores negativos y sacarle los valores absolutos para mostrar su positivo
            
            //El operador Math.abs segun vi, se usa para tomar un numero y si este es 
            // positivo, el valor absoluto sera positivio y se colocara exactamente igual
            // y si el numero es negativo el valor absoluto lo volvera negativo y se colocara positivo
        }
        // los voy a apalzar a todos

    }
}