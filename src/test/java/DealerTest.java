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

}
