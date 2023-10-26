import java.util.Iterator;

public class DeckIterator implements Iterator<Speilkarte> {

    private int index;
    this.index = 0;
    private Deck deck;
    @Override
    public boolean hasNext() {
        return (index<deck.getKarten().size());

    }

    @Override
    public Speilkarte next() {
        if (hasNext()){
            return deck.getKarten().get(index + 1);
        }
        return null;
    }
}
