package Lesson15;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedaClass {
    public static void main(String[] args) {
        Example<Double> stringExample = new Example<>();
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        stringExample.printElementCollection(strings);
    }
}

class Example<T extends Number>{
    T value;

    public void showValue(){
        System.out.println(value);
    }
    public <V> void
    printElementCollection(List<V> values){

        for (V v : values) {
            System.out.println(v);
        }
    }
}
