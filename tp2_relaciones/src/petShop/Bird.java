package petShop;

import org.w3c.dom.ls.LSOutput;

public class Bird extends Animal{
    private String species;
    private boolean itSpeaks;

    public Bird(String name, int age, float price) {
        super(name, age, price);
    }
    public Bird(String name, int age, float price, String species, boolean itSpeaks) {
        super(name, age, price);
        this.species = species;
        this.itSpeaks = itSpeaks;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String isItSpeaks() {
        if (itSpeaks){
            return "si";
        } else {
            return "no";
        }

    }

    public void setItSpeaks(boolean itSpeaks) {
        this.itSpeaks = itSpeaks;
    }

    @Override
    public String toString() {
        return "Ave: nombre " +this.getName()+", especie "+this.getSpecies()+", edad "+this.getAge()+", puede hablar "+
                this.isItSpeaks()+ ", precio "+this.getPrice();
    }
}
