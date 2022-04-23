package Home2;

public class Figure {
    private String name;
    private int radius;

    public Figure() {

    }

    public Figure(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
