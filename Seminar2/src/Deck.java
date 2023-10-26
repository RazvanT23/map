import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Speilkarte> {
    private List<Speilkarte> karten;

    public Deck(List<Speilkarte> karten){
        this.karten = karten;

    }
    public void addKarte(Speilkarte s){
        karten.add(s);

    }

    public List<Speilkarte> getKarten() {
        return karten;
    }

    @Override
    public Iterator<Deck> iterator() {
        return new DeckIterator
    }
}
