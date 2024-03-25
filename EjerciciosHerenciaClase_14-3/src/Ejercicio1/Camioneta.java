package Ejercicio1;

public class Camioneta extends Vehiculo {
    private int load;

    public Camioneta() {
    }

    public Camioneta(String color, int wheels, int load) {
        super(color, wheels);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
