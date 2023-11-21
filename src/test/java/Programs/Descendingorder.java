package Programs;

import java.util.Arrays;
import java.util.List;

public class Descendingorder {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,34,55,56,11);
        ls.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);
    }
}
