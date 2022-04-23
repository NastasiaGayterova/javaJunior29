package Lesson8;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 5);
        Rectangle rectangle1 = new Rectangle(3,5);

        int plPr = rectangle.ploshad();
        int plPr1 = rectangle1.ploshad();

        int perPr = rectangle.perimetr();
        System.out.println(perPr);

        int perPr1 = rectangle1.perimetr();
        System.out.println(perPr1);

        System.out.println(rectangle1.equals(rectangle));
    }
}
