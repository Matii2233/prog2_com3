package library;
import java.util.ArrayList;

public class Library{
    private ArrayList<Book> books;

    public Library(Book book) {
        this.books = new ArrayList<Book>();
        this.books.add(book);
    }

    public ArrayList<Book> getBooks() {return books;}
    public void setBooks(Book book) {
        this.books.add(book);
    }
    public void addNewBook(Book book){
        books.add(book);
    }
    public void toListBooks(){
        for(Book book : books){
            System.out.println("  " +book.getTitle());
            System.out.println("   autor: " +book.getAuthor());
            System.out.println("   fecha de publicacion: " +book.getPublicationYear());
            if (book.isLent()) {
                System.out.println("   estado del libro: prestado");
            } else {
                System.out.println("   estado del libro: disponible");
            }
            System.out.println();
        }
    }
    public void lendBook(Book book) {
        boolean wasLent = false;
        for (Book b : books) {
            if (b.getTitle()==book.getTitle()) {
                book.lend();
                wasLent=true;
            }
        }
        if (!wasLent) {
            System.out.println("El libro no está disponible");
        }
    }
    public void returnBook(Book book) {
        for (Book b : books) {
            if (b.getTitle()==book.getTitle()) {
                if (b.isLent() == true) {
                    book.returnBook();
                } else {
                    System.out.println("Este libro ya fue devuelto");
                }
            }
        }
    }
}
