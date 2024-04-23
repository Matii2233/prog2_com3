import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int greaterNumPos = 0;

        System.out.println("Ingrese 10 numeros enteros");
        for(int i = 0; i < array.length; i++){
            System.out.print("  numero " +(i+1)+ ": ");
            array[i] = sc.nextInt();
        }
        System.out.println();


        System.out.println("Arreglo de 10 numeros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " +array[i]);
            if (array[i] > array[greaterNumPos]) {
                greaterNumPos = i;
            }
        }

        System.out.println();System.out.println();
        System.out.println("La posicion del numero mayor es la " +greaterNumPos);
    }
}