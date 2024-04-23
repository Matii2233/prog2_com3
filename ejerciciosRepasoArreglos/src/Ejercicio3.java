import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        boolean isprime;
        int num = 0;

        System.out.println();
        System.out.println("Ingresa 10 numeros primos entre 100 y 300");
        for(int i = 0; i<array.length; i++){
            // Leer un numero que deberia estar entre 100 y 300 y ademas ser primo
            System.out.println("  Numero " +(i+1)+ ":");
            System.out.print("  > ");
            num = sc.nextInt();
            isprime = Ejercicio2.isPrime(num);

            // Comprobar que el numero este entre 100 y 300 y ademas sea primo
            while(num<100 || num>300 || isprime==false){
                System.out.println("  Numero incorrecto, ingrese un numero primo entre 100 y 300");
                System.out.print("  > ");
                num = sc.nextInt();
                isprime = Ejercicio2.isPrime(num); // se llama a la funcion "isPrime" de la clase "Ejercicio2"
            }
            // Cuando se comprueba se guarda en el arreglo
            array[i] = num;
        }
        System.out.println();


        // Escribir el arreglo resultante
        System.out.println("Arreglo de numeros primos entre 100 y 300:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " +array[i]);
        }
        System.out.println();
    }
}
