package Ejercicio1;

public class Tigre extends Feline{
    public Tigre() {}
    public Tigre(String photo, String locate, String size, String food) {
        super(photo, locate, size, food);
    }


    public void toEat(){
        System.out.println("El tigre esta comiendo");
    }
    public void toRoar() {
        System.out.println("El tigre esta rugiendo");
    }
}
