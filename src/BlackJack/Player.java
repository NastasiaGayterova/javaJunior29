package BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer{

    private String name;
    private ArrayList<ICard> handsCard = new ArrayList<>();
    private boolean inGame = true;

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void addCardToHand(ICard card) {

        handsCard.add(card);

    }

    @Override
    public boolean needMoreCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", ваши карты");
        this.openHand();
        System.out.println("____________________");
        System.out.println("Нужна ли еще карта?");

        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")){
            return true;
        }
        return false;
    }

    @Override
    public void openHand() {

        for (ICard card: handsCard){
            card.open();
        }



    }

    @Override
    public int countValuesHand() {
        int values = 0;
        for (ICard card: handsCard){
            values = values + card.getValue();
        }
        return values;
    }
}
