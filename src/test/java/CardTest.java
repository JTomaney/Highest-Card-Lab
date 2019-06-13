import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.JACK);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getsuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.JACK, card.getRank());
    }

    @Test
    public void canGetRankValue(){
        assertEquals();
    }

}
