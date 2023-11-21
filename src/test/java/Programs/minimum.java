package Programs;

import java.util.ArrayList;
import java.util.List;

public class minimum {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(34);
        int min=lst.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);
    }
}
