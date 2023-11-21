package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CountnullfromList {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("madhu");
        ls.add("kiran");
        ls.add(null);
        ls.add(null);
        ls.add("kll");
        System.out.println(ls);
       long count= ls.stream().filter((Objects::isNull)).count();
        System.out.println(count);
    }
}
