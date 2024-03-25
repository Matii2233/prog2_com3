package Ejercicio1;

public abstract class Feline extends Animal{
    public Feline() {}


    public Feline(String photo, String locate, String size, String food) {
        super(photo, locate, size, food);
    }


    public void makeSound (){System.out.println("El felino hace un sonido caracteristico de un felino");}
}
