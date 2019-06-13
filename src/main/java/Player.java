public class Player {

    private Card card;
    private String name;

    public Player(String name, Card card) {
        this.card = card;
        this.name = name;
    }

    public Card getCard() {
        return this.card;
    }

    public String getName() {
        return this.name;
    }
}
