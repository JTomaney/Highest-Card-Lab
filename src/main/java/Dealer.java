import java.util.ArrayList;
import java.util.HashMap;

public class Dealer {

    private Deck deck;
    private ArrayList<Player> players;
    private Card card1;
    private Card card2;

    public Dealer() {
        this.players = new ArrayList<Player>();
    }

    public void prepareDeck() {
        this.deck = new Deck();
        this.deck.populate();
        this.deck.populate();
        this.deck.populate();
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
        this.card1 = this.deck.deal();
        this.card2 = this.deck.deal();
        for (int i = 0; i < numberOfPlayers; i++) {
            Card card1 = this.deck.deal();
            Card card2 = this.deck.deal();
            String playerName = String.format("Player%s", i + 1);
            Player player = new Player(playerName, card1, card2);
            this.players.add(player);
        }
    }

    public void addPlayer(String playerNum, Player player) {
        this.players.add(player);
    }

    public String determineWinner() {
        int scoreToBeat = this.card1.getValue() + this.card2.getValue();
        String result = String.format("Dealer wins with %s", scoreToBeat);
        for (Player player : this.players) {
            int card1Value = player.getCard1().getValue();
            int card2Value = player.getCard2().getValue();
            int playerScore = card1Value + card2Value;
            if (playerScore > 21 && player.getCard1().getRank() == RankType.ACE){
                playerScore -= 10;
            }
            if (player.getCard2().getRank() == RankType.ACE){
                playerScore -= 10;
            }
            if (playerScore > scoreToBeat && playerScore <= 21) {
                scoreToBeat = playerScore;
                result = String.format("%s wins with %d", player.getName(), scoreToBeat);
            }
        }
        return result;
    }

}

