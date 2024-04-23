package library;

public class Childish extends Book{
    public Childish() {}
    public Childish(String author, String title, int publicationYear, boolean lent) {
        super(author, title, publicationYear, lent);
        this.author = author;
    }

    @Override
    public void lend(){
        this.lent = true;
    }
    @Override
    public void returnBook(){
        this.lent = false;
    }
}
