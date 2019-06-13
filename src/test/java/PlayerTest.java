import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.CLUBS, RankType.EIGHT);
        player = new Player(card);
    }

    @Test
    public void playerHasCard() {
        Card playerCard = player.getCard();
        assertEquals(RankType.EIGHT, card.getRank());
    }

}
