package library;

public class Universitary extends Book{
    public Universitary() {}
    public Universitary(String author, String title, int publicationYear, boolean lent) {
        super(author, title, publicationYear, lent);
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
