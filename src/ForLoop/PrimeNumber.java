package ForLoop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number = ");
        int n=sc.nextInt();
        boolean val=true;

        if(n==1){
            val=false;
        }

        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                val=false;
                break;
            }
        }

        if(val==true){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }

    }
}
