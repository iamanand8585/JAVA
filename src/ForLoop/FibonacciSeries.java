package ForLoop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        int f0=0,f1=1,f2;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number=");
        int n=sc.nextInt();
        if(n==0){
            System.out.println(f0);
        }else if(n==1){
            System.out.println(f0);
            System.out.println(f1);
        }else{
            System.out.println(f0);
            System.out.println(f1);
            for(int i=2;i<=n;i++){
                f2=f0+f1;
                f0=f1;
                f1=f2;
                System.out.println(f2);

            }
        }



    }
}
