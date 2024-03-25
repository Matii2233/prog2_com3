package Ejercicio2;

public class Bird extends Animal{
    // ATRIBUTOS
    private String specie;
    private boolean flying; /*volador=true noVolador=false*/


    // CONSTRUCTORES
    public Bird(){
    }
    public Bird(String name, int age, String gender, String specie, boolean flying) {
        super(name, age, gender);
        this.specie = specie;
        this.flying = flying;
    }


    // GETTERS AND SETTERS

    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    public boolean isFlying() {
        return flying;
    }
    public void setFlying(boolean flying) {
        this.flying = flying;
    }


    // METODOS
    @Override
    public void makesSound(){
        System.out.println("'El ave deja salir un silbido que suena increiblemente melodioso'");
    }
    public void info(){
        System.out.println("El nombre del ave es: "+getName());
        System.out.println("La edad del ave es de: "+getAge()+" años");
        System.out.println("El genero del ave es: "+getGender());
        System.out.println("El ave es de la especie: "+getSpecie());
        if (isFlying()==true) {
            System.out.println("El ave es voladora");
        } else {
            System.out.println("El ave no es voladora");
        }
    }
}
