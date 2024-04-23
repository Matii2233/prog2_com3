package library;

public class Novel extends Book{
    public Novel() {}
    public Novel(String author, String title, int publicationYear, boolean lent) {
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
