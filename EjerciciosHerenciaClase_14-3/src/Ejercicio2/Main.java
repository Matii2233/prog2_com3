package Ejercicio2;

public class Main {
    public static void main(String args[]) {
        // Objetos animales
        Dog dog = new Dog("Crash", 4, "macho", "lasio", "shiba inu");
        Cat cat = new Cat("Mia", 7, "hembra", "marron", 88);
        Bird bird = new Bird("Angel",2,"macho","Cacatua",true);

        // Utilizacion de los metodos de cada animal
        System.out.println("Perro:");
        dog.makesSound();
        dog.info();
        System.out.println("");
        System.out.println("Gato:");
        cat.makesSound();
        cat.info();
        System.out.println("");
        System.out.println("Ave:");
        bird.makesSound();
        bird.info();
    }
}
