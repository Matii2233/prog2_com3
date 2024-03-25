package Ejercicio2;

public class Dog extends Animal{
    // ATRIBUTOS
    private String furType;  /*tipo de pelo (hondulado, listo, corto, largo)*/
    private String dogBreed;  /*raza del perro*/


    // CONSTRUCTORES
    public Dog() {
    }
    public Dog(String name, int age, String gender, String furType, String dogBreed) {
        super(name, age, gender);
        this.furType = furType;
        this.dogBreed = dogBreed;
    }


    // GETTERS Y SETTERS
    public String getFurType() {
        return furType;
    }
    public void setFurType(String furType) {
        this.furType = furType;
    }
    public String getDogBreed() {
        return dogBreed;
    }
    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }


    // METODOS
    @Override
    public void makesSound(){
        System.out.println("'El perro suelta un ladrido que suena demasiado feliz'");
    }
    public void info(){
        System.out.println("El nombre del perro es: "+getName());
        System.out.println("La edad del perro es de: "+getAge()+" años");
        System.out.println("El genero del perro es: "+getGender());
        System.out.println("El pelaje del perro es: "+getFurType());
        System.out.println("La raza del perro es: "+getDogBreed());
    }
}
