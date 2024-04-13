package PersonBook;
import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Book> books;

    public Person(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBook(Book book) {
        books.add(book);
    }

    public String getName() {
        return name;
    }
}
