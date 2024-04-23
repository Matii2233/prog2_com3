package petShop;

public class Dog extends Animal{
    private String race;
    private boolean vacunated;


    public Dog(String name, int age, float price, String race, boolean vacunated) {
        super(name, age, price);
        this.race = race;
        this.vacunated = vacunated;
    }

    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String isVacunated() {
        if (vacunated) {
            return "si";
        } else {
            return "no";
        }
    }
    public void setVacunated(boolean vacunated) {this.vacunated = vacunated;}


    @Override
    public String toString() {
        return "Perro: nombre " +this.getName()+", especie "+this.getRace()+", edad "+this.getAge()+", vacunado "+
                this.isVacunated()+ ", precio "+this.getPrice();
    }
}
