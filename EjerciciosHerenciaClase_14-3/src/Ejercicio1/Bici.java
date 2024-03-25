package Ejercicio1;

public class Bici extends Vehiculo {
    private String type;

    public Bici() {
    }
    public Bici(String color, int wheels, String type) {
        super(color, wheels);
        this.type = type;
    }

    public String getType() {return type;}
    public void setType(String type) {type = type;}
}
