package Ejercicio1;

public class Leon extends Feline{
    public Leon() {}


    public Leon(String photo, String locate, String size, String food) {
        super(photo, locate, size, food);
    }


    public void toEat(){
        System.out.println("El leon esta comiendo");
    }
    public void toRoar() {
        System.out.println("El leon esta rugiendo");
    }
}
