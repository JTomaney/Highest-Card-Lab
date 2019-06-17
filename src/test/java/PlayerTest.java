import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card1;
    Card card2;

    @Before
    public void before() {
        card1 = new Card(SuitType.CLUBS, RankType.EIGHT);
        card2 = new Card(SuitType.CLUBS, RankType.EIGHT);
        player = new Player("Player1", card1, card2);
    }

    @Test
    public void playerHasCard() {
        Card playerCard = player.getCard1();
        assertEquals(RankType.EIGHT, playerCard.getRank());
    }

    @Test
    public void playerHasName() {
        assertEquals("Player1", player.getName());
    }

}
