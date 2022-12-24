package Part_02_Interfaces_Comparable_and_Comparator.Comparable.SampleFromItKot;

import java.util.Comparator;

public class UserComparatorByAge implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }
}
