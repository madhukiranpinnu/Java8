package streamsMethods;

import java.util.Arrays;
import java.util.List;

public class limitMethod {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,5,6,6,6,7,5,7,7,7);
        System.out.println(list.stream().mapToInt(i->i).limit(4).sum());
    }
}
