package Ejercicio1;

public class Perro extends Canine{
    public Perro() {}
    public Perro(String photo, String locate, String size, String food) {
        super(photo, locate, size, food);
    }


    public void toEat(){
        System.out.println("El perro esta comiendo alimento");
    }
    public void makeSound(){
        System.out.println("El perro esta ladrando");
    }
    public void toTakeAWalk(){
        System.out.println("Sacaste a pasear al perro");
    }
    public void toVaccinate(){
        System.out.println("Se llevo a vacunar al perro, y a este parece no gustarle");
    }
}
