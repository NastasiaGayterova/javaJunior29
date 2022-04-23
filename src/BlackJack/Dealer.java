package BlackJack;

public class Dealer extends Player implements IDealer{

    public Dealer(){
        super("Крупье");
    }

    @Override
    public boolean needMoreCard() {
        if(countValuesHand() < 10){
            return true;
        }
        return false;
    }
}
