package Part_02_Interfaces_Comparable_and_Comparator.Comparable.SampleFromItKot;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


public class SortingUsers {
    public static void main(String[] args) {
        User user1 = new User("Jhon", 24, 3000);
        User user2 = new User("Mark", 36, 3500);
        User user3 = new User("Olaf", 21, 2700);
        User user4 = new User("Maria", 25, 2900);
        User user5 = new User("Oleg", 47, 4500);

        Map<User, String> usersMap = new TreeMap<>();
        usersMap.put(user1, "text1");
        usersMap.put(user2, "text2");
        usersMap.put(user3, "text3");
        usersMap.put(user4, "text4");
        usersMap.put(user5, "text5");

        for (Map.Entry<User, String> entry : usersMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();

        Comparator userComparatorBySalary = new UserComparatorBySalary();
        Comparator userComparatorByName = new UserComparatorByName();
        Comparator userComparatorByAge = new UserComparatorByAge();

        Map<User, String> usersMapNew = new TreeMap<>(userComparatorBySalary.thenComparing(userComparatorByName).thenComparing(userComparatorByAge));
//        Map<User, String> usersMapNew = new TreeMap<>(userComparatorBySalary.thenComparing(userComparatorByName).thenComparing(User::getAge));
        usersMapNew.put(user1, "text1");
        usersMapNew.put(user2, "text2");
        usersMapNew.put(user3, "text3");
        usersMapNew.put(user4, "text4");
        usersMapNew.put(user5, "text5");

        usersMapNew.entrySet().forEach(System.out::println);
    }
}
