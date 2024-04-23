package petShop;

public class Cat extends Animal{
    private String race;
    private boolean sterilized;

    public Cat(String name, int age, float price) {
        super(name, age, price);
    }

    public Cat(String name, int age, float price, String race, boolean sterilized) {
        super(name, age, price);
        this.race = race;
        this.sterilized = sterilized;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String isSterilized() {
        if (sterilized) {
            return "si";
        } else {
            return "no";
        }
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }


    @Override
    public String toString() {
        return "Gato: nombre " +this.getName()+", especie "+this.getRace()+", edad "+this.getAge()+", esterilizado "+
                this.isSterilized()+ ", precio "+this.getPrice();
    }
}
