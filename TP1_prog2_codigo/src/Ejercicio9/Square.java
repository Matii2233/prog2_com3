package Ejercicio9;

import Ejercicio9.GeometricFigure;

public class Square extends GeometricFigure {
    private float side;


    public Square(float side) {
        this.side = side;
    }


    @Override
    public void area(){
        System.out.println("El area del cuadrado es "+side*side+"cm^2");
    }
    public void perimeter(){
        System.out.println("El perimetro del cuadrado es "+side*4+"cm");
    }
}
