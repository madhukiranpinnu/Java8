package Programs;

import java.util.Arrays;
import java.util.List;

public class Numberstartswith1 {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(11,23,4,4,12,23,12,3,33,42);
        System.out.println(ls);
        ls.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);
    }
}
