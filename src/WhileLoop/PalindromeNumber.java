package WhileLoop;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        int x=n;
        int sum=0;

        while (n>0){
            sum=sum*10+n%10;
            n=n/10;
        }

        if(sum==x){
            System.out.print("Palindrome");
        }else {
            System.out.print("Not Palindrome");
        }
    }
}
