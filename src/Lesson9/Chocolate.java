package Lesson9;

public class Chocolate extends Dobavka{
    public Chocolate(Baking baking) {
        super(baking);
    }



    @Override
    public long getPrice() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "с шоко";
    }
}
