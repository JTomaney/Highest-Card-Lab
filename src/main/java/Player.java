public class Player {

    private Card card1;
    private Card card2;
    private String name;

    public Player(String name, Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
        this.name = name;
    }

    public Card getCard1() {
        return this.card1;
    }

    public Card getCard2() {
        return this.card2;
    }

    public String getName() {
        return this.name;
    }
}
