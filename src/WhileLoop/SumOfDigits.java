package WhileLoop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        int sum=0;
        while (n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.print("Sum of Digits="+sum);
    }
}
