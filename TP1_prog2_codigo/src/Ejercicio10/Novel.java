package Ejercicio10;

public class Novel extends Book{
    private String type;

    public Novel(String author, String tittle, float price, String type) {
        super(author, tittle, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showInfo(){
        System.out.println("El autor de la novela es "+getAuthor());
        System.out.println("El titulo de la novela es "+getTittle());
        System.out.println("El precio de la novela es "+getPrice());
        System.out.println("El tipo de novela es "+getType());
    }
}
