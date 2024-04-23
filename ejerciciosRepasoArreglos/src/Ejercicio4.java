import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        ArrayList<Integer> posFinInFourNum = new ArrayList<Integer>();

        System.out.println("Ingrese 10 numeros enteros");
        for(int i = 0; i < array.length; i++){
            System.out.print("  numero " +(i+1)+ ": ");
            array[i] = sc.nextInt();
            if (array[i]%10 == 4){
                posFinInFourNum.add(i);
            }
        }
        System.out.println();


        System.out.println("Posiciones de numeros terminados en 4:");
        for(int num : posFinInFourNum) {
            System.out.print("  " + num);
        }
        System.out.println();
    }
}
