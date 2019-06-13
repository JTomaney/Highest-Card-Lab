import java.util.ArrayList;
import java.util.HashMap;

public class Dealer {

    private Deck deck;
    private ArrayList<Player> players;

    public Dealer() {
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

    public int countPlayers() {
        return this.players.size();
    }

    public void deal(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            Card card = this.deck.deal();
            String playerName = String.format("Player%s", i + 1);
            Player player = new Player(playerName, card);
            this.players.add(player);
        }
    }

    public void addPlayer(String playerNum, Player player) {
        this.players.add(player);
    }

    public String determineWinner() {
        String result = "Wat";
        int score = 0;
        for (Player player : this.players) {
            int cardValue = player.getCard().getRank().getValue();
            if (cardValue > score) {
                score = cardValue;
                result = String.format("%s wins with %d", player.getName(), cardValue);
            }


        }
        return result;
    }

}

