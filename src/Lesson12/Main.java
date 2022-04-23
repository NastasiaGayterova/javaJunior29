package Lesson12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(0,999);

        numbers.remove(0);
        numbers.set(0, 444);
        System.out.println(numbers);
    }
}
