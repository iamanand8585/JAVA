package ForLoop;

import java.util.Scanner;

//1/1+1/2+1/3+....+1/n

public class Series1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n=sc.nextInt();

        float sum=0;

        for(float i=1;i<=n;i++){
            sum+=1/i;
        }
        System.out.println("Result = "+sum);
    }
}
