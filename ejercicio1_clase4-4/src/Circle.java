package ejercicio1;

public class Circle implements Drawable, Figure{
    private float radio;


    public Circle() {}
    public Circle(float radio) {
        this.radio = radio;
    }


    public float getRadio() {return radio;}
    public void setRadio(float radio) {this.radio = radio;}


    @Override
    public void area(){
        float PI = 3.1416f;
        System.out.println("El area del circulo es "+ PI*Math.pow(radio,2));
    }
    public void toDraw() {
        System.out.println("Se dibujo un circulo de radio: "+radio);
    }
}
