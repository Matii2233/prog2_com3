package Ejercicio1;

public class Canine extends Animal{
    public Canine() {}


    public Canine(String photo, String locate, String size, String food) {
        super(photo, locate, size, food);
    }


    public void makeSound (){
        System.out.println("El canino hace un sonido caracteristico de un canino");
    }
}
