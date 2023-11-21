package streamsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class distinctMethod {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,3,5,6,5);
        ls.stream().mapToInt(i->i).distinct().forEach(System.out::println);
    }
}
