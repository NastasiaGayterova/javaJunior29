package Lesson9;

public class TestTort {
    public static void main(String[] args) {
        Baking baking = new Tort();
        System.out.println(baking.getDescription());
        System.out.println(baking.getPrice());

        baking = new Crem(baking);
        System.out.println(baking.getDescription());
        System.out.println(baking.getPrice());
    }
}
