package LessonOOP;

public class Main1 {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("Мышка", 2000);
        Proizvoditel lg = new Proizvoditel("LG");
        lg.setDescription("Это корейский производитель");
        lg.setPathToImage("c.windows//");

        tovar.setProizvoditel(lg);

        User user = new User("vasya_pupkin", "Вася Пупкин", 100);
        user.setPathToAvatar("C://dowloads//image.jpg");

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setRating(5);
        otziv.setMainText("Покупал , все ок");

        tovar.addOtzivToTovar(otziv);
        System.out.println();

        // создать типы - треугольник.круг.квадрат.овал
        //
    }
}
