package Lesson6;

import java.util.Scanner;

public class ScannerUtils {
    public static String getLevelFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете уровень сложности: ");
        System.out.println("1 - Новичек");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        String inputLevel = scanner.nextLine();
        if (!inputLevel.equals("1") &&
                !inputLevel.equals("2") &&
                !inputLevel.equals("3") &&
                !inputLevel.equals("4") &&
                !inputLevel.equalsIgnoreCase("Новичек") &&
                !inputLevel.equalsIgnoreCase("Любитель") &&
                !inputLevel.equalsIgnoreCase("Профессионал") &&
                !inputLevel.equalsIgnoreCase("Особый")) {
            return getLevelFromUser();
        }


        return inputLevel;
    }
}
