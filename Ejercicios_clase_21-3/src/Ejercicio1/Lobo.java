package Ejercicio1;

public class Lobo extends Canine{
    public Lobo() {}


    public Lobo(String photo, String locate, String size, String food) {
        super(photo, locate, size, food);
    }


    public void toEat() {
        System.out.println("El lobo esta comiendo");
    }
    public void makeSound(){
        System.out.println("El lobo esta aullando");
    }
}
