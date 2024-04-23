import java.util.Iterator;

public class Team implements Iterable<Player>{
    private Player[] players;
    private int size = 11;

    public Team(int size) {
        this.players = new Player[size];
        this.size = size;
    }

    public void addPlayer(int pos, Player player){
        players[pos] = player;
    }

    @Override
    public Iterator<Player> iterator() {
        return new IteratorPlayers(players, size);
    }
}
