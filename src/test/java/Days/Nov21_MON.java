package Days;

import java.util.Scanner;

public class Nov21_MON {
    public static void main(String[] args) {
        //Reverse a string
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int str_length=str.length();
        int j=0;
        char[] array=new char[str_length];
        for(int i=str_length-1;i>=0;i--){
            array[j]=str.charAt(i);
            j++;
        }
        System.out.println(array);
    }
}
