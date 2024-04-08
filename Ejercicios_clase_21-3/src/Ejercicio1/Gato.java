package Ejercicio1;

public class Gato extends Feline{
    public Gato() {}
    public Gato(String photo, String locate, String size, String food) {
        super(photo, locate, size, food);
    }


    public void toEat(){
        System.out.println("El leon esta comiendo");
    }
    public void toRoar() {
        System.out.println("El gato esta maullando");
    }
    public void toVaccinate(){
        System.out.println("El gato fue llevado a vacunarse y parece no importarle");
    }
}
