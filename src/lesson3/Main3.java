package lesson3;

public class Main3 {
    public static void main(String[] args) {


        char[] qwer = {'q', 'w', 'e', 'r'};
        char[] asdf = {'a', 's', 'd', 'f'};

        char[] qwerasdf = new char[qwer.length + asdf.length];
        qwerasdf[0] = qwer[0];
        qwerasdf[1] = qwer[1];
        qwerasdf[2] = qwer[2];
        qwerasdf[3] = qwer[3];

        qwerasdf[4] = qwer[0];
        qwerasdf[5] = qwer[1];
        qwerasdf[6] = qwer[2];
        qwerasdf[7] = qwer[3];


        for (int i = 0; i < qwerasdf.length; i++) {
            if(i < qwer.length) {
                qwerasdf[i] = qwer[i];
            }else {
                    qwerasdf[i] = asdf[i - qwer.length];
                }
                }
                System.out.println();
            }
        }




