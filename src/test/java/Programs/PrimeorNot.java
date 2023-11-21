package Programs;

import java.util.function.Predicate;

public class PrimeorNot {
    public static void main(String[] args) {
        Predicate<Integer> ps=i->{
            boolean b;
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 0){
                b= true;
            }
            else {
                b=false;
            }
            return b;
        };
        System.out.println(ps.test(4));
        System.out.println(ps.test(17));
        System.out.println(ps.test(23));
    }
}
