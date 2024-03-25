package Ejercicio2;

public class Cat extends Animal{
    // ATRIBUTOS
    private String stripesColor; /*color de las rayas*/
    private int catLength; /*longitud del gato en centimetros*/


    // CONSTRUCTORES
    public Cat() {}
    public Cat(String name, int age, String gender, String stripesColor, int catLength) {
        super(name, age, gender);
        this.stripesColor = stripesColor;
        this.catLength = catLength;
    }


    // GETTERS AND SETTERS
    public String getStripesColor() {
        return stripesColor;
    }
    public void setStripesColor(String stripesColor) {
        this.stripesColor = stripesColor;
    }
    public int getCatLength() {
        return catLength;
    }
    public void setCatLength(int catLength) {
        this.catLength = catLength;
    }


    // METODOS
    @Override
    public void makesSound(){
        System.out.println("'El gato deja salir un maullido que suena como super relajado'");
    }
    public void info(){
        System.out.println("El nombre del gato es: "+getName());
        System.out.println("La edad del gato es de: "+getAge()+" años");
        System.out.println("El genero del gato es: "+getGender());
        System.out.println("El color de las rayas del gato es: "+getStripesColor());
        System.out.println("La longitud del gato es de: "+getCatLength()+"cm");
    }
}
