package Operators;
import java.util.Scanner;
public class ArithmeticOperators {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int diff=a-b;
        int product=a*b;
        float div=a/b;
        int remainder=a%b;
        int floordiv=a/b;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(div);
        System.out.println(remainder);
        System.out.println(floordiv);

    }



}