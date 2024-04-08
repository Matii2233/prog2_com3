package ejercicio1;

public class Square  implements Rotable, Drawable, Figure{
    private float side;


    public Square() {}
    public Square(float side) {
        this.side = side;
    }


    public float getSide() {return side;}
    public void setSide(float side) {this.side = side;}


    @Override
    public void area(){
        System.out.println("El area del cuadrado es "+side*side);
    }
    public void rotate() {
        System.out.println("Se roto el cuadrado");
    }
    public void toDraw(){
        System.out.println("Se dibujo un cuadrado de lado "+side);
    }
}
