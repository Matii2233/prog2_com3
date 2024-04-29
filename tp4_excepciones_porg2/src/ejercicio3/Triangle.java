package ejercicio3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    // ATRIBUTOS
    private float base;
    private float height;
    private float area;
    private Scanner sc = new Scanner(System.in);
    // CONSTRUCTOR
    public Triangle() {
    }
    // MÉTODOS
    public float getBase() {
        return base;
    }
    public float getHeight() {
        return height;
    }
    public void inputBase() {
        float num;
        while (true) {
            try {
                System.out.print("Ingresa la base del triangulo: ");
                num = sc.nextFloat();
                if (num <= 0) {
                    throw new InputMismatchException();
                }
                base = num;
                break;
            } catch (InputMismatchException e){
                System.out.println("Error, el valor de la base debe ser un numero entero o flotante");
                sc.next();
            } catch (NumberFormatException e){
                System.out.println("Error, tipo de dato incorrecto");
                sc.next();
            }
        }
    }
    public void inputHeight() {
        float num;
        while (true) {
            try {
                System.out.print("Ingresa la altura del triangulo: ");
                num = sc.nextFloat();
                if (num <= 0) {
                    throw new InputMismatchException();
                }
                height = num;
                break;
            } catch (InputMismatchException e){
                System.out.println("Error, el valor de la altura debe ser un numero entero o flotante");
                sc.next();
            } catch (NumberFormatException e){
                System.out.println("Error, tipo de dato incorrecto");
                sc.next();
            }
        }
    }
    public float calculateArea() {
        area = base*(height/2);
        return area;
    }


    // METODO MAIN
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.inputBase();
        t.inputHeight();
        System.out.println("El area del triangulo es: " + t.calculateArea());
    }
}
