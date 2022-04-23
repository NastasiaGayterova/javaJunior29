package HomeLesson1;

public class main5 {
    public static void main(String[] args) {
        int evenSumma = 0;
        int odd = 0;
        for(int i = 1; i<=11;i++){
            if (i % 2 == 0) {
                evenSumma++;
            }
            else odd++;
        }
        if (evenSumma > odd){
            System.out.println(evenSumma);
        }
        else System.out.println(odd);
    }
}


