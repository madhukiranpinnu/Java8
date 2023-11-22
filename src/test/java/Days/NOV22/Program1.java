package Days.NOV22;

import java.util.Scanner;

public class Program1
{
    public static void main(String[] args) {
        // reverse each word
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        String revline = new String();
        for(int j=s1.length-1;j>=0;j--){
            int k=0;
            char[] rev = new char[s1[j].length()];
            for(int i=s1[j].length()-1;i>=0;i--){
                rev[k]=s1[j].charAt(i);
                k++;
            }
            revline=revline+" "+new String(rev);
        }
        System.out.println(revline);
    }
}
