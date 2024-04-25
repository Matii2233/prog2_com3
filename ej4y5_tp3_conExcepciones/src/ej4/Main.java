package ej4;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        int selection = 0;
        int exit = 1;
        System.out.println("Sistema de gestion estudiantil");


        while (exit != 0) {
            System.out.println("  1- agregar un nuevo alumno");
            System.out.println("  2- agregar varios alumnos");
            System.out.println("  3- Mostrar la lista de alumnos");
            System.out.println("  4- Calcular la media de las notas de los alumnos");
            System.out.println("  5- Mostrar alumno con la nota mas alta");
            System.out.println("  6- Buscar alumno");
            System.out.println("  0- Salir");
            System.out.println();

            try {
                System.out.print("Ingrese un numero  > ");
                selection = sc.nextInt();
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado es de tipo incorrecto");
                System.out.println("Se saldra del programa");
                selection = 0;
                System.out.println();
            }


            switch (selection) {
                case 1:
                    Functions.addStudent(sc, students);
                    break;
                case 2:
                    Functions.addStudents(sc, students);
                    break;
                case 3:
                    Functions.showStudents(students);
                    break;
                case 4:
                    Functions.calculateMean(students);
                    break;
                case 5:
                    Functions.showStudentByHighestGrade(students);
                    break;
                case 6:
                    Functions.searchStudent(sc, students);
                    break;
                case 0:
                    exit = 0;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println("Desea continuar ? (si/no)");
            sc.next();
            String s = sc.next();

            if (s.equals("no")) {
                exit = 0;
            }
            System.out.println();
        }
    }
}