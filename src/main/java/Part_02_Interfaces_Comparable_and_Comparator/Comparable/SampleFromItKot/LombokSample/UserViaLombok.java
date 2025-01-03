package Part_02_Interfaces_Comparable_and_Comparator.Comparable.SampleFromItKot.LombokSample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

/**
 * Класс UserViaLombok демонстрирует использование Lombok для генерации конструкторов, геттеров и toString.
 * <p>
 * Используемые аннотации:
 * <ul>
 *     <li>@NoArgsConstructor - создает конструктор без аргументов.</li>
 *     <li>@RequiredArgsConstructor - создает конструктор для всех final полей или полей с аннотацией @NonNull.</li>
 *     <li>@AllArgsConstructor - создает конструктор со всеми полями класса.</li>
 *     <li>@Builder - предоставляет удобный API для создания объектов через паттерн "Builder".</li>
 * </ul>
 */
@Getter
@ToString
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class UserViaLombok {
    private String name;
    private int age;
    private String position;
}

class LombokSample {
    static UserViaLombok userViaLombok;

    public static void main(String[] args) {
        userViaLombok = new UserViaLombok("Sample_Name", 20, "worker");
        System.out.println("UserViaLombok " + userViaLombok.getClass());
    }
}