package Ejercicio1;

public class Coche extends Vehiculo {
    private float speed;
    private float displaysment;

    public Coche() {
    }
    public Coche(String color, int wheels, float speed, float displaysment) {
        super(color, wheels);
        this.speed = speed;
        this.displaysment = displaysment;
    }


    public float getSpeed() {return speed;}
    public void setSpeed(float speed) {this.speed = speed;}

    public float getDisplaysment() {return displaysment;}
    public void setDisplaysment(float displaysment) {this.displaysment = displaysment;}
}
