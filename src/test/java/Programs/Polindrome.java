package Programs;

import java.util.function.Predicate;

public class Polindrome {
    public static void main(String[] args) {
        Predicate<String> pf=s->{

            int z=0;
            char[] a = new char[s.length()];
            int k=0;
            StringBuffer sb = new StringBuffer();
            for(int j=s.length()-1;j>=0;j--,k++){
                a[k]=s.charAt(j);
            }
            for(char p:a){
                sb.append(p);
            }
            String rev= String.valueOf(sb);
            return rev.equals(s);
        };
        System.out.println(pf.test("ama"));
        System.out.println(pf.test("kaka"));
    }
}
