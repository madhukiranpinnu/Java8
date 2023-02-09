import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeEmptyvalues {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("madhu","","kiran","","kok");
        long l=ls.stream().filter(x->x.isEmpty()).count();
        System.out.println(l);
    }
}
