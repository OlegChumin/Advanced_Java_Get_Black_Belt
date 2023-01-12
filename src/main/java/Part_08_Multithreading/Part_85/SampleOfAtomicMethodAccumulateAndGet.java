package Part_08_Multithreading.Part_85;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BinaryOperator;

public class SampleOfAtomicMethodAccumulateAndGet {
    public static void main(String[] args) {
        {
            // AtomicReference with value
            AtomicReference<Integer> ref = new AtomicReference<>(3456);

            // Print AtomicReference
            System.out.println(
                    "The AtomicReference before update: " + ref);

            // Value to apply accumulateAndGet
            int x = 45654;

            // Declaring the accumulatorFunction
            // applying function to add value as string
            BinaryOperator add = (u, v) -> u.toString() + v.toString();

            // apply accumulateAndGet()
            ref.accumulateAndGet(x, add);
            // print AtomicReference

            System.out.println(
                    "The AtomicReference after update: " + ref);
        }
    }
}
