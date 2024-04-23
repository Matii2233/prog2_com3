package petShop;
import java.util.ArrayList;
public class PetShop {
    private ArrayList<Dog> dogs;
    private ArrayList<Cat> cats;
    private ArrayList<Bird> birds;
    private ArrayList<Fish> fishes;

    public PetShop() {
        this.dogs = new ArrayList<>();
        this.cats = new ArrayList<>();
        this.birds = new ArrayList<>();
        this.fishes = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        } else if (animal instanceof Bird) {
            birds.add((Bird) animal);
        } else if (animal instanceof Fish) {
            fishes.add((Fish) animal);
        } else {
            System.out.println("Animal no encontrado");
        }
    }
    public void sellAnimal(Animal animal){
        if (animal instanceof Dog) {
            dogs.remove((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.remove((Cat) animal);
        } else if (animal instanceof Bird) {
            birds.remove((Bird) animal);
        } else if (animal instanceof Fish) {
            fishes.remove((Fish) animal);
        } else {
            System.out.println("Animal no encontrado");
        }
    }

    public void toListAnimals(){
        for (Dog dog : dogs) {
            System.out.println(dogs.toString());
        }
        for (Cat cat : cats) {
            System.out.println(cats.toString());
        }
        for (Bird bird : birds) {
            System.out.println(birds.toString());
        }
        for (Fish fish : fishes) {
            System.out.println(fishes.toString());
        }
    }

    public void feedAnimals(Animal animal){
        if (animal instanceof Dog) {
            System.out.println("El/la perro/a " +animal.getName()+ " fue alimentado");
        } else if (animal instanceof Cat) {
            System.out.println("El/la gato/a " +animal.getName()+ " fue alimentado");
        } else if (animal instanceof Bird) {
            System.out.println("El/la ave " +animal.getName()+ " fue alimentado");
        } else if (animal instanceof Fish) {
            System.out.println("El pez " +animal.getName()+ " fue alimentado");
        } else {
            System.out.println("Animal no encontrado");
        }
    }
}
