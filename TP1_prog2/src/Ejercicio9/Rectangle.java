public class Rectangle extends GeometricFigure{
    private float side_a;
    private float side_b;

    public Rectangle(float side_a, float side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public float getSide_a() {return side_a;}
    public void setSide_a(float side_a) {this.side_a = side_a;}
    public float getSide_b() {return side_b;}
    public void setSide_b(float side_b) {this.side_b = side_b;}

    @Override
    public void area(){
        System.out.println("El area del rectangulo es "+side_a*side_b+"cm^2");
    }
    public void perimeter(){
        System.out.println("El perimetro del rectangulo es "+(side_a+side_b)*2+"cm");
    }
}
