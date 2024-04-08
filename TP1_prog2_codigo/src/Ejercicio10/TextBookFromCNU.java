package Ejercicio10;

public class TextBookFromCNU extends TextBook{
    private String faculty;

    public TextBookFromCNU(String author, String tittle, float price, String course, String faculty) {
        super(author, tittle, price, course);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public void showInfo(){
        System.out.println("El curso al que pertenece el libro de texto de la universidad de colombia es "+super.getCourse());
        System.out.println("El autor del libro de texto de la universidad de colombia es "+super.getAuthor());
        System.out.println("El titulo del libro de texto de la universidad de colombia es "+super.getTittle());
        System.out.println("El precio del libro de texto de la universidad de colobia es"+super.getPrice());
        System.out.println("La facultad donde se publico el libro de la universidad de colombia es "+this.getFaculty());
    }
}
