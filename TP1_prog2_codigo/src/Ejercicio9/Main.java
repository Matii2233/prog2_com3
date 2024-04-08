package Ejercicio9;

import Ejercicio9.Circle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle(2.2f);
        Rectangle r1 = new Rectangle(2,3.3f);
        Square s1 = new Square(4);

        c1.area();
        c1.perimeter();
        r1.area();
        r1.perimeter();
        s1.area();
        s1.perimeter();
    }
}