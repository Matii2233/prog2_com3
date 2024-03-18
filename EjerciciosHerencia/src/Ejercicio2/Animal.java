package Ejercicio2;

public class Animal {
    //ATRIBUTOS
    private String name;
    private int age;
    private String gender;


    // CONSTRUCTORES
    public Animal() {
    }
    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    // GETTERS Y SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    // METODOS
    public void makesSound() {
        System.out.println("'El animal deja salir un sonido generico que suena muy bien'");
    }
    public void info(){
        System.out.println("El nombre del animal es: "+getName());
        System.out.println("La edad del animal es de: "+getAge()+" años");
        System.out.println("El genero del animal es: "+getGender());
    }
}