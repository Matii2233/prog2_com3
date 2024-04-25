package ej4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Functions {
    public static void addStudent(Scanner sc, ArrayList<Student> students){
        String name;
        int age = 0;
        float grade = 0.0f;

        try {
            System.out.println("Ingrese el nombre del alumno:");
            name = sc.next();

            System.out.println("Ingresa la edad del alumno");
            age = sc.nextInt();

            System.out.println("Ingresa la nota del alumno");
            grade = sc.nextFloat();

            Student s = new Student(name, age, grade);
            students.add(s);
            System.out.println("Alumno guardado");
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("El dado ingresado es de tipo incorrecto");
            System.out.println("El alumno no se guardo");
            System.out.println();
        }
    }

    public static void addStudents(Scanner sc, ArrayList<Student> students){
        int exit = 1;

        while(exit!=0){
            addStudent(sc, students);
            System.out.println("Presione '0' para salir u otro numero para continuar");
            try {
                exit = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("No se ingreso el numero esperado");
                System.out.println("Se saldra de la funcion de agregar alumnos");
            }
            System.out.println();
        }
    }

    public static void showStudents(ArrayList<Student> students){
        System.out.println("Alumnos:");
        for (Student s : students) {
            System.out.println(" Nombre: " +s.getName());
            System.out.println(" Edad: " +s.getAge());
            System.out.println(" Nota: " +s.getGrade());
            System.out.println();
        }
    }

    public static void calculateMean(ArrayList<Student> students){
        float mean;
        float sum = 0;
        for (Student s : students) {
            sum = sum + s.getGrade();
        }
        mean = sum / students.size();
        System.out.println("La media de notas de los alumnos es: " +mean);
        System.out.println();
    }

    public static void showStudentByHighestGrade(ArrayList<Student> students){
        float highestGrade = 0;
        String studentName = "";
        for (Student s : students) {
            if (s.getGrade() >= highestGrade) {
                highestGrade = s.getGrade();
                studentName = s.getName();
                break;
            }
        }
        System.out.println("El alumno de mayor nota es " +studentName);
        System.out.println();
    }

    public static void searchStudent(Scanner sc, ArrayList<Student> students){
        System.out.print("Nombre del estudiante a buscar: ");
        String studentName = sc.next();

        for (Student s : students) {
            if (s.getName().equals(studentName)) {
                System.out.println("  Nombre: " +s.getName());
                System.out.println("  Edad: " +s.getAge());
                System.out.println("  Nota: " +s.getGrade());
                break;
            } else {
                System.out.println("alumno no encontrado");
            }
        }
    }
}
