package Programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        Set<String> set=new HashSet<>();
        ls.add("madhu");
        ls.add("kiran");
        ls.add("madhu");
        ls.forEach(set::add);
        System.out.println(set);
    }
}
