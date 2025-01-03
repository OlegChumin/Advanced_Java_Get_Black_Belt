package Part_02_Interfaces_Comparable_and_Comparator.Comparable.SampleFromItKot.LombokSample;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @NoArgsConstructor
 * Генерирует конструктор без аргументов.
 *
 * @RequiredArgsConstructor
 * Генерирует конструктор для полей, помеченных как final, и полей с аннотацией @NotNull.
 *
 * @AllArgsConstructor
 * Генерирует конструктор со всеми полями класса.
 *
 * @Builder
 * Позволяет создавать объекты класса с использованием паттерна "Builder".
 * Эта аннотация не только генерирует конструктор, но и предоставляет удобный API для построения объектов.
 */

@Getter
@ToString
@AllArgsConstructor
public class UserViaLombok implements Comparable<UserViaLombok> {
    private String name;
    private int age;
    private int salary;

    @Override
    public int compareTo(UserViaLombok other) {
        // Реализация метода сравнения
        return Integer.compare(this.salary, other.salary);
    }
}
