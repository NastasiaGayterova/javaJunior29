package Interf;

public class Main {
    public static void main(String[] args) {
        Slon slon = new Slon();
        Slon slon1 = new Slon();

        Tiger tiger = new Tiger();
        Tiger tiger1 = new Tiger();

        Medved medved = new Medved();
        Medved medved1 = new Medved();

        AbstractAnimal[] animals = new AbstractAnimal[6];
        animals[0] = medved;
        animals[1] = medved1;
        animals[2] = tiger;
        animals[3] = tiger1;
        animals[4] = slon;
        animals[5] = slon1;

        // for each :

        for (AbstractAnimal currentAnimal : animals){
             currentAnimal.voice(); // проявление полиморфизма
            // полиморфизм - это свойство Java, которое проявляется в момент запуска программмы
            // данное свойство позволяет работать с разнвми типами данными как с одним и тем же
            // но в тоже самое время реализация отрабатывает, как будто мыработаем
        }



    }
}
