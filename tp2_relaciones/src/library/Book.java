package library;

public class Book implements Lendable{
    protected String author;
    protected String title;
    protected int publicationYear;
    protected boolean lent;

    public Book() {}
    public Book(String author, String title, int publicationYear, boolean lent) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.lent = lent;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isLent() {
        return lent;
    }

    public void setLent(boolean lent) {
        this.lent = lent;
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
