package Programs;

import java.util.function.Function;

public class Stringreverse {
    public static void main(String[] args) {
        Function<String,String> fs=s->{
            StringBuffer sb=new StringBuffer(s);
            sb.reverse();
            return String.valueOf(sb);
        };
        System.out.println(fs.apply("madhukiran"));
    }
}
