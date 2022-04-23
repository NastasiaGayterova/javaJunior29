package Interf;

public class Tiger extends AbstractAnimal{
    @Override
    public void printHave() {
        System.out.println("Хвост есть!");
    }

    @Override
    public void voice() {
        System.out.println("рррррр ррррррр");
    }
}
