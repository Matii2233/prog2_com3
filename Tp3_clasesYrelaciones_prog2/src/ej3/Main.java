package ej3;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        List<String> weekdays = new ArrayList<>();

        weekdays.add("Lunes");
        weekdays.add("Martes");
        weekdays.add("Miércoles");
        weekdays.add("Jueves");
        weekdays.add("Viernes");
        weekdays.add("Sábado");
        weekdays.add("Domingo");
        System.out.println();

        System.out.println("Lista inicial:");
        System.out.println(" "+weekdays);
        System.out.println();


        ////
        System.out.println("Inserta en la posición 4 el elemento “Juernes” y Muestra el contenido de las posiciones 3 y 4");
        weekdays.set(3, "Juernes");
        System.out.println(" posicion 3: " + weekdays.get(2));
        System.out.println(" posicion 4: " + weekdays.get(3));
        System.out.println();


        ////
        System.out.println("Muestra el primer elemento y el último de la lista.");
        System.out.println(" Primer elemento: " +weekdays.get(0));
        System.out.println(" Ultimo elemento: " +weekdays.get(weekdays.size()-1));
        System.out.println();



        ////
        System.out.println("Elimina el elemento que contenga “Juernes” de la lista y comprueba que haya sido eliminado");
        weekdays.remove("Juernes");
        System.out.println(" "+weekdays);
        System.out.println();

        System.out.println("Crea un iterador y muestras uno a uno los valores de la lista");

        for (String s : weekdays) {
            System.out.println(" " +s);
        }
        System.out.println();



        ////
        System.out.println("Busca si existe en la lista un elemento que se denomine “Lunes”");
        if (weekdays.contains("Lunes")) {
            System.out.println(" Se encontro a 'Lunes'");
        } else {
            System.out.println(" No se encontro el elemento");
        }
        System.out.println();



        ////
        System.out.println("Busca si existe en la lista un elemento que se denomine “Lunes”. No importa si está en "+
                "mayúscula o minúscula.");
        String word = "LuNeS"; // palabra con mezcla de mayus y minusculas
        word = word.toLowerCase(); // la transformo a minusculas
        for (String e : weekdays) { // itero sobre los elementos
            if (e.toLowerCase().equals(word)) { // comparo los elementos en minuscula con la palabra en minuscula
                System.out.println(" " + e);
            }
        }
        System.out.println();



        ////
        System.out.println("Eliminar todos los elementos de la lista");
        weekdays.removeAll(weekdays);

        System.out.println("  lista actualizada " +weekdays);
    }
}
