package streamsMethods;

import java.util.Arrays;
import java.util.List;

public class SkipMethod {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,5,4,9,5,5,5,5,4);
        System.out.println(list.stream().mapToInt(i -> i).skip(4).sum());
    }
}
