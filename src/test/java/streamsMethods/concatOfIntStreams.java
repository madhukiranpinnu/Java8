package streamsMethods;

import java.util.stream.IntStream;

public class concatOfIntStreams {
    public static void main(String[] args) {
        IntStream stream1=IntStream.of(1,2,3,4,5,6);
        IntStream stream2=IntStream.of(7,8,9);
        IntStream.concat(stream1,stream2).forEach(System.out::println);
    }
}
