package Interf;

public class Slon extends AbstractAnimal{
    @Override
    public void printHave() {
        System.out.println("Хвост есть!");
    }

    @Override
    public void voice() {
        System.out.println("УУУУУУ УУУУУУУ");
    }
}
