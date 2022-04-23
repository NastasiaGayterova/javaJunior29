package Lesson9;

public abstract class Dobavka implements Baking{
    Baking baking;
    public Dobavka(Baking baking) {
        this.baking = baking;
    }
}
