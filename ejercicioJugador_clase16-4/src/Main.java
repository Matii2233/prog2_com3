import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Rodrigo De Paul", 7, "Medicampista");
        Player p2 = new Player("Angel Di Maria", 11, "Extremo");
        Player p3 = new Player("Nicolas Otamendi", 2, "Defensor Central");
        Team team = new Team(3);

        team.addPlayer(0,p1);
        team.addPlayer(1,p2);
        team.addPlayer(2,p3);

        System.out.println("Listado de jugadores: ");

        /*for (Player player : team) {
            System.out.println(player.getName());
        }*/

        Iterator<Player> it1 = team.iterator();

        while (it1.hasNext()) {
            System.out.println("  " +it1.next().getName());
        }
    }
}