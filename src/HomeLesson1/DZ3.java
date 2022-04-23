package HomeLesson1;

public class DZ3 {
    public static void main(String[] args) {

        // 1) Вывести на консоль сумму всех чисел внутри массива


        int[] mas = {2, 4, 45, 3, 64, 3, 5};
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        System.out.println(sum);
        System.out.println("Конец 1-ого задания");

        // 2) Вывести на консоль массив в обратном порядке


        int[] a = {2, 4, 45, 3, 64, 3, 5};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
        System.out.println("Конец 2-ого задания");


        // 3) Вывести на консоль через одну ячейку с начала


        int[] с = {2, 4, 45, 3, 64, 3, 5};
        for (int i = 0; i < с.length; i = i + 2) {
            System.out.println(с[i]);
        }

        // 4) Вывести на консоль сумму четных


        int[] b = {2, 4, 45, 3, 64, 3, 5};
        int summ = 0;

        for (int i = 1; i < b.length - 1; i++) {
            summ = b[i - 1] + b[i + 1];
            if (summ % 2 == 0)
                System.out.println(i);


        }


    }


}
