package lesson3;

public class Main1 {
    public static void main(String[] args) {
        //сть массив символов, напечатать только глассные с него

        char[] chars = {'r', 'a', 'b', 'o', 't', 'a',};

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o' || chars[i] == 'a'){
                System.out.println(chars[i]);
            }
        }
    }
}
