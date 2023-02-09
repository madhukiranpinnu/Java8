import java.util.Arrays;
import java.util.List;

public class maximum {
    public static void main(String[] args) {
        List<Integer> sa= Arrays.asList(1,2,3,4,0,67,65,35,6,4,6,646,6,6,64,64);
        int max=sa.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);
    }
}
