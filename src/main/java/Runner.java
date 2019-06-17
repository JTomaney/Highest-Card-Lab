public class Runner {


    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.prepareDeck();
        dealer.deal(5);
        String result = dealer.determineWinner();
        System.out.println(result);
    }

}
