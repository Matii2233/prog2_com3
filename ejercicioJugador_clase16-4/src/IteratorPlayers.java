import java.util.Iterator;

public class IteratorPlayers implements Iterator<Player> {
    private Player[] players;
    private int index = 0;
    private int size;

    public IteratorPlayers(Player[] players, int size) {
        this.players = players;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public Player next() {
        return players[index++];
    }
}
