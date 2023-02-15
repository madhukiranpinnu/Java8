package streamsMethods;

import java.util.Arrays;
import java.util.List;

public class MapToDouble {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,23,4,4,16,256,225);
        list.stream().mapToDouble(i->Math.sqrt(i)).forEach(System.out::println);
    }
}
