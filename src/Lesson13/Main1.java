package Lesson13;

import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {

        Coin coin1 = new Coin(1800, 5, 2.4, "Золото");
        Coin coin2 = new Coin(1800, 4, 3.1, "Серебро");

        Coin coin3 = new Coin(1900, 4, 3.5, "Олово");
        Coin coin4 = new Coin(2000, 3, 1.3, "Золото");
        Coin coin5 = new Coin(2100, 5, 2.8, "Рубин");

        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin coin: coins){
            System.out.println(coin);
        }

    }
}
