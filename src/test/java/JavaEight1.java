import java.util.function.IntPredicate;
import java.util.function.Predicate;


public class JavaEight1 {
    public static void main(String[] args) {
        //odd or even
        Predicate<Integer> ip=(a)->a%2==0;
        System.out.println(ip.test(20));
        System.out.println(ip.test(21));
    }
}
