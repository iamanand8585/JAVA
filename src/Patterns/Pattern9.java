package Patterns;

/*

*
**
* *
****

 */

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Rows=");
        int n=sc.nextInt();

        //Portion 1
        System.out.println("*");

        //Portion 2
        for(int i=2;i<=n-1;i++){
            System.out.print("*");
            for (int j=1;j<=i-2;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        //Portion 3
        if(n>1){
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
        }
    }
}
