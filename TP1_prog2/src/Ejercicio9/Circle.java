public class Circle extends GeometricFigure{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {return radius;}
    public void setRadius(float radius) {this.radius = radius;}

    @Override
    public void area(){
        System.out.println("El area de la circunferencia es "+Math.pow(radius, 2)*3.1416+"cm^2");
    }
    public void perimeter(){
        System.out.println("El perimetro de la circunferencia es "+2*radius*3.1416+"cm");
    }
}
