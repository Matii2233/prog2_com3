package CasaPuerta;
import java.util.ArrayList;

public class House {
    private ArrayList<Door> doors;

    public House() {}
    public House(Door doors){
        this.doors = new ArrayList<>();
        this.setDoors(doors);
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(Door door) {
        this.doors.add(door);
    }
}
