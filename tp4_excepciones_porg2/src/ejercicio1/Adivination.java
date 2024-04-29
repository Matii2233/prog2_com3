package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Adivination {

    // METODO MAIN
    public static void main(String[] args) {
        System.out.println("Adivina el numero (del 1 al 100)");
        adivinateTheNumber();
    }



    // FUNCION ADIVINAR EL NUMERO
    public static void adivinateTheNumber(){
        Scanner sc = new Scanner(System.in);
        Random r =  new Random();
        int tries=0;
        int userNum = 0;
        int systemNum = r.nextInt(100)+1;
        //int systemNum = 20;

        while (tries < 5) {
            try {
                System.out.println();
                System.out.print("Intento "+(tries+1+ ": "));
                userNum = sc.nextInt();
                tries++;
                if (userNum == systemNum) {
                    System.out.println("Felicidades adivinaste el numero");
                    break;
                } else {
                    if (systemNum<userNum) {
                        System.out.println("Numero incorrecto. El numero secreto es menor que tu numero");
                        System.out.println("Te quedan " +(3-tries)+ " intentos");
                    }
                    if (systemNum>userNum) {
                        System.out.println("Numero incorrecto. El numero secreto es mayor que tu numero");
                        System.out.println("Te quedan " +(3-tries)+ " intentos");
                    }
                }
            } catch (InputMismatchException e){
                System.out.println("Error, ingrese un numero entero");
                System.out.println("Te quedan " +(3-tries)+ " intentos");
                tries++;
                sc.next();
            }
        }
        System.out.println();
        System.out.println("Saliendo...");
    }
}