package Lesson5;

public class StringUtils {
    // формула создания метода
    // 1 - модификатор доступа (одно из четырех слов)
    // public - виден внутри всего проекта
    // package (или ничего не поставить) - виден внутри пакета и дочерним классом
    // protected - внутри текущего класса и дочерним класса
    // private - внутри текущего класса только виден

    // 2 - static (или пишем или нет)
    // 3 - возвращаемый тип (int, string, int[])
    // 4 - название метода (с маленькой буквы, максимально описывающий)
    // 5 - входящие параметры в () - то без чего невозможно выполнить метод
    // указываем через запятую, тип название,
    // 6 - тело выполнение метода
    // Создадим метод, который принимает текст и символ, счичает сколько
    // символов таких в тексте и возвращает числом

    public static int countSimvols(String text, char ch){
        // text = "fyguhu hhijij ikkhbhh";
        // ch = r;
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            char currentCh = text.charAt(i);
            if(ch == currentCh){
                count++;
            }
        }
        return count;
    }
    //метод принимает входящим параметром текст
    // и печатает на консоль текст в обратном порядке


    }

