import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speilkarte> cards = new ArrayList<>();
        cards.add(new Spielkarte("Kreuz" ,10));
        cards.add(new Spielkarte("Kreuz" ,10));
        Deck deck = new Deck(cards);
        for(int i=0; i<deck.getKarten().size(); i++){
            System.out.println(deck.getKarten().get(i));
        }
    }
}