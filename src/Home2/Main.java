package Home2;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure("Круг", 180);
        Triangle triangle = new Triangle("Треугольник", 12, 12, 5);
        Square square = new Square("Квадрат", 4, 4, 4, 4);
        Oval oval = new Oval("Овал", 30);
        Rectangle rectangle = new Rectangle("Прямоугольник", 2, 2, 4, 4);

        System.out.println();
    }
}
