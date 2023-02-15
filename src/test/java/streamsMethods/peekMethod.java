package streamsMethods;

import java.util.Arrays;
import java.util.List;

public class peekMethod {
    public static void main(String[] args) {
        List<Integer> list
                = Arrays.asList(0, 2, 4, 6, 8, 10);
        list.stream().peek(System.out::println).count();
    }
}
