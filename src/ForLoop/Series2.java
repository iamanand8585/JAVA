package ForLoop;

import java.util.Scanner;
//1/1-1/2+1/3-1/4+.....+1/n
public class Series2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number = ");
        int n=sc.nextInt();

        float sum=0;

        for (float i=1;i<=n;i++){
            if(i%2==0){
                sum-=1/i;
            }else {
                sum+=1/i;
            }
        }

        System.out.println("Result = "+sum);


    }
}
