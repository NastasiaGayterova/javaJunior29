package Lesson15;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {
        Student student = new Student(1, "Ivan", 2);
        Student student1 = new Student(2, "Alice", 3);
        Student student2 = new Student(3, "Nastya", 4);
        Student student3 =  new Student(4, "Volody", 5);

        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("Биология", student);

    }
}
