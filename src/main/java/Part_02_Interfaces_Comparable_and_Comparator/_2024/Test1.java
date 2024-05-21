package Part_02_Interfaces_Comparable_and_Comparator._2024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        System.out.println("Список по порядку внесения: " + list);
        Collections.shuffle(list);
        System.out.println("Перемешанный список: " + list);
        Collections.sort(list);
        System.out.println("Cортированный список: " + list);
    }
}
