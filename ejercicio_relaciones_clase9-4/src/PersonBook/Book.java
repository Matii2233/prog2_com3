package PersonBook;
import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Person> owners;

    public Book(String title, Person owner) {
        this.title = title;
        this.owners = new ArrayList<>();
        this.setOwner(owner);
    }

    public ArrayList<Person> getOwners() {
        return owners;
    }

    public void setOwner(Person person) {
        owners.add(person);
    }

    public String getTitle() {
        return title;
    }
}