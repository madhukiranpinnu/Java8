package streamsMethods;

import java.util.ArrayList;
import java.util.List;

public class noMatch {
    public static void main(String[] args) {
        List<String> lk=new ArrayList<>();
        lk.add("kl");
        lk.add("hvhgvj");
        lk.add("oolmmlomoo");
        System.out.println(lk.stream().noneMatch(i ->i.length()<=4));
    }
}
