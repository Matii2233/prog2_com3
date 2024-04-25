package ej4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void addStudent(Scanner sc, ArrayList<Student> students){
        System.out.println("Ingrese el nombre del alumno:");
        String name = sc.next();

        System.out.println("Ingrese la edad del alumno");
        int age = sc.nextInt();

        System.out.println("Ingrese la nota del alumno");
        float grade = sc.nextFloat();

        Student s = new Student(name, age, grade);
        students.add(s);

        System.out.println("Alumno guardado");
        System.out.println();
    }

    public static void addStudents(Scanner sc, ArrayList<Student> students){
        int exit = 1;
        while(exit!=0){
            addStudent(sc, students);
            System.out.println("Presione '0' para salir u otro numero para continuar");
            exit = sc.nextInt();
            System.out.println();
        }
        System.out.println("Alumnos guardados");
        System.out.println();
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

    // ********************************************************************************************************* //


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        int selection = 0;
        int exit = 1;
        System.out.println("Sistema de gestion estudiantil");


        while (exit!=0){
            System.out.println("  1- agregar un nuevo alumno");
            System.out.println("  2- agregar varios alumnos");
            System.out.println("  3- Mostrar la lista de alumnos");
            System.out.println("  4- Calcular la media de las notas de los alumnos");
            System.out.println("  5- Mostrar alumno con la nota mas alta");
            System.out.println("  6- Buscar alumno");
            System.out.println("  0- Salir");
            System.out.println();
            System.out.print("Ingrese un numero  > ");
            selection = sc.nextInt();
            System.out.println();


            switch (selection)
            {
                case 1:
                    addStudent(sc, students);
                    break;
                case 2:
                    addStudents(sc, students);
                    break;
                case 3:
                    showStudents(students);
                    break;
                case 4:
                    calculateMean(students);
                    break;
                case 5:
                    showStudentByHighestGrade(students);
                    break;
                case 6:
                    searchStudent(sc, students);
                    break;
                case 0:
                    exit = 0;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println("Desea continuar ? (si/no)");
            String s = sc.next();
            if (s.equals("no")) {
                exit = 0;
            }
            System.out.println();
        }
    }
}