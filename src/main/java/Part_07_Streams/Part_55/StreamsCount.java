package Part_07_Streams.Part_55;

import java.util.stream.Stream;

public class StreamsCount {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream.count()); // count return number of stream elements
//        System.out.println(stream.distinct().count()); // cannot be used again after previous stream usage
    }
}
