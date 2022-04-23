package Lesson4;

public class Main4 {
    public static void main(String[] args) {
        int[][] chees = new int[8][8];
        // вывести диагональ вторую без первой едиичками
        for (int i = 0; i < chees.length; i++) {
            for (int j = 0; j < chees[i].length; j++) {
                if((i + j) % 2== 0) { // i = j решение по диагонали
                    System.out.print(chees[i][j] + " ");
                } else {
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
        }
    }
}
