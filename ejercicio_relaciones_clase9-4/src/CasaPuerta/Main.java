package CasaPuerta;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Door d1 = new Door("Carton  )': ");
        Door d2 = new Door("Metal  >:D ");
        House h1 = new House(d1);

        h1.setDoors(d2);

        System.out.println("Los materiales de la casa son");
        for(Door doors : h1.getDoors()){
            System.out.println("  " +doors.getMaterial());
        }
    }
}
