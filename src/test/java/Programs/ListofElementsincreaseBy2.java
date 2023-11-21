package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListofElementsincreaseBy2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        List<Integer> l1=list.stream().map(i->i+2).collect(Collectors.toList());
        System.out.println(l1);
    }
}
