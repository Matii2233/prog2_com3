package PersonBook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Carlitos");
        Person p2 = new Person("Tomas");
        Book b1 = new Book("El señor de los anillos", p1);
        Book b2 = new Book("Harry Potter", p1);
        Book b3 = new Book("Cancion de fuego y hielo", p1);

        p1.setBook(b1); // carlitos adquiere el señor de los anillos
        p2.setBook(b1); // tomas adquiere el señor de los anillos
        b1.setOwner(p2); // el señor de los anillos adquiere el propietario tomas
        p1.setBook(b2); // carlitos adquiere harry potter
        p1.setBook(b3); // carlitos adquiere la cancion de fuego y hielo

        System.out.println("El nombre de la persona es "+ p1.getName());
        System.out.println(p1.getName()+ " Tiene los libros: ");
        for(Book books : p1.getBooks()) {
            System.out.println("  "+books.getTitle());
        }

        System.out.println("El nombre del libro es "+ b1.getTitle());
        System.out.println("Los propitarios de "+ b1.getTitle()+ " son:");
        for(Person owners : b1.getOwners()) {
            System.out.println("  "+owners.getName());
        }
    }
}