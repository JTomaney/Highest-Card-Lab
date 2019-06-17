import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return this.cards.size();
    }

    public void populate() {
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();
        for (SuitType suit : suits){
            for (RankType rank : ranks){
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public Card getFirstCard() {
        return this.cards.get(0);
    }

    public Card getLastCard() {
        return this.cards.get(51);
    }

    public Card get26ThCard() {
        return this.cards.get(25);
    }

    public void shuffle() {
//        System.out.println(this.cards);
        Collections.shuffle(this.cards);
//        System.out.println(this.cards);
    }

    public Card deal() {
        return this.cards.remove(0);
    }

}
