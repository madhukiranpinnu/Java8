import java.util.Arrays;
import java.util.List;

public class CountNumberElemts {
    public static void main(String[] args) {
        List<String> as= Arrays.asList("madhu","kiran","pinnu","ds");
        System.out.println(as.stream().count());
    }
}
