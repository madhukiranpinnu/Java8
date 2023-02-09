import java.util.Arrays;
import java.util.List;

public class SortAndPrintvalues {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,23,44,43,12,535,5,5,54,55,454,54);
        ls.stream().sorted().forEach(System.out::println);
    }
}
