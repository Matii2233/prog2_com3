package ej5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TasksList lt1 = new TasksList();

        while (true) {
            int option;
            System.out.println("Bienvenido al sistema ¿Qué acción desea realizar?");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Eliminar una tarea");
            System.out.println("4. Salir");

            try {
                System.out.print(" > ");
                option = sc.nextInt();
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado es de tipo incorrecto");
                System.out.println("Se saldra del programa");
                option = 4;
                System.out.println();
            }

            switch (option) {
                case 1:
                    System.out.println("Ingrese la descripción de la tarea:");
                    sc.nextLine();
                    String descripcion = sc.nextLine();

                    System.out.println("Ingrese la prioridad de la tarea");
                    int prioridad = sc.nextInt();

                    Task tarea = new Task(descripcion, prioridad);
                    lt1.addTask(tarea);
                    System.out.println("Tarea agregada");
                    System.out.println("-----------------------------");
                    break;

                case 2:
                    System.out.println("Lista de tareas:");
                    for (Task t : lt1.getTasks()) {
                        System.out.println("Descripción: " + t.getDescription() + ", Prioridad: " + t.getPriority());
                    }
                    System.out.println("-----------------------------");
                    break;

                case 3:
                    System.out.println("Ingrese la descripción de la tarea que desea eliminar");
                    sc.nextLine();
                    String eliminateDescription = sc.nextLine();

                    lt1.removeByDescription(eliminateDescription);
                    System.out.println("-----------------------------");
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("El numero ingresado no corresponde a ninguna opcion");
            }
        }
    }
}
