package Programs;

import java.util.Arrays;
import java.util.List;

public class suminStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,6,7);
        int sum=list.stream().mapToInt(i->i).sum();
        System.out.println(sum);
    }
}
