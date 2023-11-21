package Days.NOV11;

import java.util.Scanner;

public class day1a {
    public static void main(String args[]){
        //Reverse the Number
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int j = 0;
        int rev=0;
        while(number!=0){
            j=number%10;
            rev=rev*10+j;
            number=number/10;
        }
        System.out.println(rev);
    }
}
