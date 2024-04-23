package petShop;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Leo", 3, 70000, "Pastor Aleman", true);
        Cat c1 = new Cat("Lira", 5, 100000, "Ragdoll", true);
        Bird b1 = new Bird("Hanu", 2, 30000, "hornero", false);
        Fish f1 = new Fish("Tuna", 4, 35000, "Dorado", "dorada", 6.2f);
        Fish f2 = new Fish("Angel", 1, 43000, "Pez Angel", "negro y patrones blancos", 8.5f);
        PetShop petshop = new PetShop();

        petshop.addAnimal(d1);
        petshop.addAnimal(c1);
        petshop.addAnimal(b1);
        petshop.addAnimal(f1);

        petshop.toListAnimals();
        System.out.println();

        petshop.sellAnimal(f1);
        petshop.addAnimal(f2);

        petshop.toListAnimals();
        System.out.println();
        petshop.feedAnimals(d1);
    }
}