package ejercicio1;


public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.4f);
        Square s1 = new Square(3.6f);
        System.out.println(c1.getRadio());
        System.out.println(s1.getSide());

        c1.toDraw();
        c1.area();


        s1.area();
    }
}