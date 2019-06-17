import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void before() {
        dealer = new Dealer();
    }

    @Test
    public void dealerHasDeck() {
        dealer.prepareDeck();
        Deck deck = dealer.getDeck();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void dealerCanDeal() {
        dealer.prepareDeck();
        dealer.deal(2);
        assertEquals(2, dealer.countPlayers());
    }

    @Test
    public void dealerCanDetermineWinner() {
        Card card1 = new Card(SuitType.CLUBS, RankType.TEN);
        Card card2 = new Card(SuitType.CLUBS, RankType.EIGHT);
        Card card3 = new Card(SuitType.CLUBS, RankType.THREE);
        Player player1 = new Player("Player1", card1, card2);
        Player player2 = new Player("Player2", card2, card3);
        dealer.addPlayer("Player1", player1);
        dealer.addPlayer("Player2", player2);
        String result = dealer.determineWinner();
        assertEquals("Player1 wins with 18", result);
    }

}
