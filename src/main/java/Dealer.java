import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private ArrayList<Player> players;

    public Dealer(){
        this.players = new ArrayList<Player>();
    }

    public void prepareDeck() {
        this.deck = new Deck();
        this.deck.populate();
        this.deck.shuffle();

    }

    public Deck getDeck() {
        return this.deck;
    }
}
