package Lesson9;

public class Crem extends Dobavka{

    public Crem(Baking baking) {
        super(baking);
    }

    @Override
    public long getPrice() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "крем";
    }
}
