package Ejercicio1;

public class Motocicleta extends Vehiculo{
    private int speed;
    private float displayment;

    public Motocicleta() {
    }
    public Motocicleta(String color, int wheels, int speed, float displayment) {
        super(color, wheels);
        this.speed = speed;
        this.displayment = displayment;
    }

    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}

    public float getDisplayment() {return displayment;}
    public void setDisplayment(float displayment) {this.displayment = displayment;}
}
