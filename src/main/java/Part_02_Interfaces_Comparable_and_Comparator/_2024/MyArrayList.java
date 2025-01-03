package Part_02_Interfaces_Comparable_and_Comparator._2024;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Переопределение функции toString для ArrayList
 */

public class MyArrayList extends ArrayList<String> {
    @Override
    public String toString() {
        // Здесь ты можешь определить свою логику преобразования списка в строку
        StringBuilder sb = new StringBuilder("MyArrayList: --[");
        IntStream.range(0, this.size()).forEachOrdered(i -> {
            sb.append(this.get(i));
            if (i < this.size() - 1) {
                sb.append(", ");
            }
        });
        sb.append("]--");
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println("Cтандартный вывод toString ArrayList: " + arrayList);

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Hello");
        myArrayList.add("World");
        myArrayList.add("!");
        System.out.println("Кастомный вывод toString MyArrayList: " + myArrayList);
    }
}
