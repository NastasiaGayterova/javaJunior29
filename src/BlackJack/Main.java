package BlackJack;

public class Main {
    public static void main(String[] args) {
        PravilaBlackJack pravilaBlackJack = new PravilaBlackJack();

        Player player1 = new Player("Вася");
        Player player2 = new Player("Саша");
        Dealer dealer = new Dealer();

        pravilaBlackJack.addPlayer(player1);
        pravilaBlackJack.addPlayer(player2);
        pravilaBlackJack.addPlayer(dealer);

        pravilaBlackJack.dealTwoCards();
        pravilaBlackJack.dealAllCards();
        pravilaBlackJack.printWinner();

    }
}
