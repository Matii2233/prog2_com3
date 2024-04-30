import java.util.Random;

public class Athlete extends Person implements Contract{

    // ATRIBUTOS
    private double height;
    private int age;
    private double weight;



    // CONSTRUCTORES
    public Athlete(){
    }
    public Athlete(int idn, String name, double height, int age, double weight) {
        super(idn, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }



    // METODOS
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}

    @Override // Contract
    public double calculateIMC() {
        return weight / Math.pow(height, 2);
    }
    @Override // Contract
    public boolean thereIsExcessWeight (double IMC) {
        if (IMC > 25) {
            return true;
        } else {
            return false;
        }
    }
    @Override // Contract
    public double takePulsations (){
        Random r = new Random();
        return r.nextDouble()*(175 - 65) + 65;
    }
}
