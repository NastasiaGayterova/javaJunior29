package BlackJack;

import java.util.ArrayList;

public class PravilaBlackJack implements IPravilaBlackJack{

    private Coloda coloda = new Coloda();
    private ArrayList<IPlayer> players = new ArrayList<>();

    @Override
    public void addPlayer(IPlayer player) {

        players.add(player);

    }

    @Override
    public void dealTwoCards() {

        for(IPlayer player: players){
            player.addCardToHand(coloda.getRandomCard());
            player.addCardToHand(coloda.getRandomCard());

        }

    }

    @Override
    public void dealAllCards() {

        for (IPlayer player: players){
            while (player.needMoreCard()){
                player.addCardToHand(coloda.getRandomCard());

            }
        }

    }

    @Override
    public void printWinner() {

        //устанавливаем перебор, если больше чем 21
        for (IPlayer player: players){
            if(player.countValuesHand() > 21){
                player.setInGame(false);
            }
        }
        //если у всех перебор выиграл крупье
        if (countPlayerInGame() == 0){
            for(IPlayer player: players){
                if (player instanceof Dealer){
                    System.out.println("------ПОБЕДИТЕЛЬ " + player.getName());
                    player.openHand();
                }

            }
        }

        //узнаем какое число выигрышное
        int winnerValue = 0;
        for (IPlayer player: players){
            if (player.isInGame() && player.countValuesHand() > winnerValue) {
                winnerValue = player.countValuesHand();
            }
        }
        //печатаем победителя
        for (IPlayer player: players){
            if (player.isInGame() && player.countValuesHand() == winnerValue){
                System.out.println("------ПОБЕДИТЕЛЬ " + player.getName());
                player.openHand();
            }
        }

    }
    public  int countPlayerInGame(){
        int count = 0;
        for (IPlayer player: players){
            if (player.isInGame()){
                count++;

            }
        }
        return count;
    }
}
