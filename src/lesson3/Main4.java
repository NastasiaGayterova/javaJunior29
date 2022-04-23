package lesson3;

public class Main4 {
    public static void main(String[] args) {
        String password = "qwerty1";

        int dLinna = password.length();
        if(dLinna < 8) {
            System.out.println("Пароль меньше 8 символов!!!");
        }
    }
}
