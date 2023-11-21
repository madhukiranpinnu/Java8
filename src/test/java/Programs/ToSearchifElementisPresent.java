package Programs;

import java.util.Arrays;
import java.util.List;

public class ToSearchifElementisPresent {
    public static void main(String[] args) {
        List<String> as= Arrays.asList("madhu","kiran","pinnu","sai","jaisiyaram","jkjdcj");
        System.out.println(as.stream().anyMatch(i -> i.equals("pinnu")));
    }
}
