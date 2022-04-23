package Interf;

public class Medved extends AbstractAnimal{
    @Override
    public void printHave() {
        System.out.println("Нет хвоста!");
    }

    @Override
    public void voice() {
        System.out.println("рарарарараара");
    }
}
