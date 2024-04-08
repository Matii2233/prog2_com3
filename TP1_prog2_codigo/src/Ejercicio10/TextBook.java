package Ejercicio10;

public class TextBook extends Book{
    private String course;

    public TextBook(String author, String tittle, float price, String course) {
        super(author, tittle, price);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void showInfo(){
        System.out.println("El autor del libro de texto es "+getAuthor());
        System.out.println("El titulo del libro de texto es "+getTittle());
        System.out.println("El precio del libro de texto es "+getPrice());
        System.out.println("El curso al que pertenece el libro de texto es "+getCourse());
    }
}
