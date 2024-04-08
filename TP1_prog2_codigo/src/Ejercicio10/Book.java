package Ejercicio10;

public abstract class Book {
    private String author;
    private String tittle;
    private float price;

    public Book(String author, String tittle, float price) {
        this.author = author;
        this.tittle = tittle;
        this.price = price;
    }

    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getTittle() {return tittle;}
    public void setTittle(String tittle) {this.tittle = tittle;}
    public float getPrice() {return price;}
    public void setPrice(float price) {this.price = price;}

    public abstract void showInfo();
}
