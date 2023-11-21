package Programs;

import java.util.ArrayList;
import java.util.List;

public class TofindFirst {
    public static void main(String[] args) {
        List<String> la=new ArrayList<>();
        la.add("madhu");
        la.add("kiran");
        la.add("pinnu");
        String first=la.stream().findFirst().get();
        System.out.println(first);
    }
}
