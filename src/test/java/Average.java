import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Average {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,4,5,5,7);
      OptionalDouble op= ls.stream().mapToInt(e -> e).average();
        System.out.println(op.getAsDouble());
    }
}
