import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void deckCanPopulate(){
        deck.populate();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void deckStartsWithAceOfHearts(){
        deck.populate();
        Card card = deck.getFirstCard();
        assertEquals(SuitType.HEARTS, card.getsuit());
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void deckEndsWithKinfOfSpades(){
        deck.populate();
        Card card = deck.getLastCard();
        assertEquals(SuitType.SPADES, card.getsuit());
        assertEquals(RankType.KING, card.getRank());
    }

    @Test
    public void deckHasKingOfDiamondsAtIndex25(){
        deck.populate();
        Card card = deck.get26ThCard();
        assertEquals(SuitType.DIAMONDS, card.getsuit());
        assertEquals(RankType.KING, card.getRank());
    }

    @Test
    public void deckCanDealCard(){
        Card testCard = new Card(SuitType.HEARTS, RankType.JACK);
        deck.populate();
        deck.shuffle();
        Card card = deck.deal();
        assertEquals(51, deck.countCards());
        assertTrue(card.getClass().isInstance(testCard));

    }

}
