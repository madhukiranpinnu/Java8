package Programs;

import java.util.function.Function;

public class Stringlenth {
    public static void main(String[] args) {
        Function<String,Integer> f= String::length;
        System.out.println(f.apply("madhukiran"));
    }
}
