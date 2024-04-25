package ej1;

import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Asignatura a1 = new Asignatura("Matematica 1", 2, "10:15");
        Asignatura a2 = new Asignatura("Calculo 1", 5, "08:00");
        Asignatura a3 = new Asignatura("Metodologia de Investigacion", 3, "10:15");
        Profesor p1 = new Profesor(1, "Roberto Ponce", "Ingenieria", a1);
        int counter = 0;

        p1.addAsignature(a2);
        p1.addAsignature(a3);


        // a) mostrar el aula de la tercera asignatura
        System.out.println("Ejericio a");
        System.out.println("Aula de la tercera asignatura del profesor " +p1.getName());
        for (Asignatura a : p1.getAsignaturas()) {
            counter++;
            if (counter == 3) {
                System.out.println("  aula tercera asignatura: " +a.getClassroom());
            }
        }
        System.out.println();

        // b) mostrar el nombre de las asignaturas que imparte el profesor
        System.out.println("Ejericio b");
        System.out.println("Asignaturas que da el profesor " +p1.getName());

        for (Asignatura a : p1.getAsignaturas()) {
            System.out.println("  - " +a.getName());
        }
        System.out.println();


        //****************************************************************************************//


        Alumno al1 = new Alumno(1, "Matias Rodriguez");
        Alumno al2 = new Alumno(2, "Alejandra Viamonte");
        Alumno al3 = new Alumno(3, "Julian Romero");
        Alumno al4 = new Alumno(4, "Teo Liendro");
        Alumno al5 = new Alumno(5, "Pia Gonzales");
        Grupo g1 = new Grupo("programacion", 'C', al1);

        g1.addStudent(1, al2); g1.addStudent(2, al3);
        g1.addStudent(3, al4); g1.addStudent(4, al5);
        a1.addGroup(g1);
        a2.addGroup(g1);
        a3.addGroup(g1);



        // c) muestre nombre y dni de los alumnos del grupo que recibe una asignatura
        System.out.println("Ejericio c");
        System.out.println("Datos alumnos del grupo " +g1.getCourse()+ " " +g1.getletter()+ ":");
        for (Alumno a : g1.getStudents()) {
            System.out.println("  nombre: " +a.getName()+ "  dni: " +a.getIdn());
        }
        System.out.println();




        Grupo g2 = new Grupo("ingenieria", 'C', al1);
        Grupo g3 = new Grupo("ingles", 'C', al1);
        al1.addGroup(g1); al1.addGroup(g2); al1.addGroup(g3);
        counter=0;


        // d) muestre la letra del tercer grupo al que pertenece un alumno
        System.out.println("Ejercicio d");
        System.out.println("Letra del tercer grupo del alumno " +al1.getName());
        for (Grupo g : al1.getGroups()) {
            counter++;
            if (counter == 3) {
                System.out.println("  letra: " +g.getletter());
            }
        }
        System.out.println();



        // e) Teniendo un alumno, muestre todas las asignaturas recibidas por el 1er. grupo al que pertenece

        System.out.println("Asignaturas, primer grupo alumno alumno " +al1.getName());
        g1.addAsignature(a1);
        g1.addAsignature(a2);
        counter=0;
        for (Grupo g : al1.getGroups()) {
            counter++;
            if (counter == 1) {
                for (Asignatura a : g.getAsignatures()) {
                    System.out.println("  " +a.getName());
                }
            }
        }
        System.out.println();



        // f) Teniendo un objeto de Alumno y, pidiendo por pantalla, una asignatura existente, muestre
        //    desde él, el profesor que la imparte.

        Scanner sc = new Scanner(System.in);

        System.out.println("Pedir una asignatura y mostrar el profesor que la imparte desde el alumno");
        System.out.print("Nombre asignatura: ");
        String asigName = sc.nextLine();
        a1.addProfesor(p1);

        for (Grupo g : al1.getGroups()) {
            for(Asignatura a : g.getAsignatures()){
                if (a.getName().equals(asigName)) {
                    System.out.println("  profesor: " +a.getProfesor().getName());
                    break;
                }
            }
        }
        System.out.println();



        // g) Teniendo un objeto de Profesor, muestre los nombres de todos los alumnos inscriptos en el
        //    Grupo de la 2da. Asignatura.

        p1.addAsignature(a2);
        counter=0;
        System.out.println("Nombres de los alumnos del gurpo de la segunda asignatura de un profesor:");

        for (Asignatura a : p1.getAsignaturas()) {
            counter++;

            if (counter == 2) {
                System.out.println("nombre del profesor:  " +p1.getName());
                System.out.println(" asignatura: " +a.getName());

                for (Grupo g : a.getGroups()) {
                    System.out.println("  grupo: " +g.getCourse());
                    for (Alumno al : g.getStudents()) {
                        System.out.println("   alumno: " +al.getName());
                    }
                }
            }
        }
        System.out.println();
        counter=0;



        /* h) Responda: ¿En qué se diferencian una asociación de una composición y de una agregación?

                 R { En la asociacion dos objetos independientes pueden relacionarce: uno a con uno b, uno b con uno a
                     o ambas.

                     En la composicion una clase mayor hace de contenedora para varias clases menores
                     en donde tiene que haber al menos una clase menor para que la clase mayor exista.

                     En la agrupacion una clase mayor hace de contenedora para las clases menores pero no es necesario
                     que tenga al menos una clase menor para que la mayor exista.
                     }*/
    }
}
