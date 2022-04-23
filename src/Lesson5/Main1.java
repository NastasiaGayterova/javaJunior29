package Lesson5;

import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        String[][] tours = {{"Италия", "110000", "7 дней", "самолет", "5 звезды"},
                {"Мальдивы", "49000", "6 дней", "автобус", "4 звезды"},
                {"Норвегия", "80000", "7 дней", "самолет", "3 звезды"},
                {"Казахстан", "100000", "9 дней", "самолет", "4 звезды"},
                {"Италия", "78000", "5 дней", "самолет", "2 звезды"},
                {"Италия", "65000", "12 дней", "самолет", "5 звезды"}};
        //1-выбор тура по бюджету
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какой бюджет рассчитываете?");
        String moneyToTrip = scanner.nextLine();
        
        ToursUtils.printToursByMoney(tours, moneyToTrip);

        // 2 - выбор тура по стране
        //
        // 4 - печать средняя стоимость тура в страну
        // 5 - печать туры от..дней и более

        ToursUtils.printAverageCost(tours);





    }
    
    }

