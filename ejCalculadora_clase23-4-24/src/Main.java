import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numa; float numb; int selection;

        System.out.println("Selecciona una operaciones:");
        System.out.println("  1 suma");
        System.out.println("  2 resta");
        System.out.println("  3 multiplicacion");
        System.out.println("  4 division");
        System.out.println();

        while(true) {
            try {
                System.out.print("  > ");
                selection = sc.nextInt();

                if (selection > 0 && selection < 5) {
                    break;
                } else {
                    System.out.println("El numero es incorrecto. Debe ser del 1 al 4");
                }
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Error. Se debe seleccionar un numero del 1 al 4");
                sc.next();
            }
        }

        System.out.println("*****************************************");
        System.out.println("Introduce el primer numero");
        System.out.print("  > ");
        numa = sc.nextFloat();
        System.out.println();

        System.out.println("Introduce el segundo numero");
        System.out.print("  > ");
        numb = sc.nextFloat();
        System.out.println();

        switch (selection){
            case 1:
                System.out.println("El resultado es: " +sumar(numa, numb));
                break;
            case 2:
                System.out.println("El resultado es: " +restar(numa, numb));
                break;
            case 3:
                System.out.println("El resultado es: " +multiplicar(numa, numb));
                break;
            case 4:
                System.out.println("El resultado es: " +dividir(numa, numb));
                break;
        }
    }


    public static float restar(float a, float b) {
        return a-b;
    }
    public static float sumar(float a, float b) {
        return a+b;
    }
    public static float multiplicar(float a, float b) {
        return a*b;
    }

    public static float dividir(float a, float b) {
        Scanner sc = new Scanner(System.in);
        float resultado = 0;
        while (true) {
            try {
                if (b == 0.0f) {
                    throw new ArithmeticException("División por cero");
                }
                resultado = a / b;
                break;
            } catch (Exception e) {
                System.out.println("Error. No se puede dividir por 0");
                System.out.println("Introduzca nuevamente el segundo numero");
                System.out.print("  > ");
                b = sc.nextFloat();
            }
        }
        return resultado;
    }

    public float sumar(int a, int b) {
        return a + b;
    }

    public float restar(int a, int b) {
        return a - b;
    }
}