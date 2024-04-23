import java.util.Scanner;

public class Ejercicio2 {
    // Metodo main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        boolean isprime;
        int greatestPrime=1;


        System.out.println("Ingrese 10 numeros enteros");
        for(int i = 0; i < array.length; i++){
            // Llenado del arreglo
            System.out.print("  numero " +(i+1)+ ": ");
            array[i] = sc.nextInt();

            // Comprobacion de numero primo mayor
            isprime = isPrime(array[i]);
            if (isprime) {
                if (array[i]>greatestPrime) {
                    greatestPrime = array[i];
                }
            }
        }
        System.out.println();


        // Mostrar arreglo
        System.out.println("Arreglo de 10 numeros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " +array[i]);
        }
        System.out.println();System.out.println();


        // Imprimor resolucion
        if(greatestPrime!=1){
            System.out.println("El numero primo mayor es " +greatestPrime);
        } else {
            System.out.println("No hay ningun numero primo");
        }
    }


    // Funcion que comprueba si un numero es primo
    public static boolean isPrime(int num){
        // num < 2 return false;
        if (num <= 1) {
            return false;
        }
        // num divisible por algun numero de 2 a hasta num^2 return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        // caso contrario a las dos situaciones anteriores return true;
        return true;
    }
}
