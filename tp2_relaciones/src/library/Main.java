package library;

public class Main {
    public static void main(String[] args) {
        Novel n1 = new Novel("Lovecraft", "La llamada de cthulhu", 1928, false);
        Universitary u1 = new Universitary("Mario Di Marco", "Teoria de las derivadas", 1995, false);
        Childish c1 = new Childish("Laura Romero", "Pinocho Infantil", 1992, false);
        Library library = new Library(n1);

        // añadir mas libros a la libreria
        library.addNewBook(c1);
        library.addNewBook(u1);


        // mostrar libros de la libreria
        System.out.println("Libros de la libreria:");
        library.toListBooks();


        // prestar un libro de la libreria, y mustrar si estan disponibles o no los libros
        library.lendBook(n1);
        System.out.println("Estado de los libros:");
        for (Book book : library.getBooks()) {
            if (!book.isLent()) {
                System.out.println("  " +book.getTitle()+ ": devuelto");
            } else {
                System.out.println("  " +book.getTitle()+ ": prestado");
            }
        }
        System.out.println();


        // devolver un libro de la libreria
        library.returnBook(n1);
        System.out.println("Estado de los libros:");
        for (Book book : library.getBooks()) {
            if (!book.isLent()) {
                System.out.println("  " +book.getTitle()+ ": devuelto");
            } else {
                System.out.println("  " +book.getTitle()+ ": prestado");
            }
        }
        System.out.println();
    }
}
