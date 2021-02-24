package Patterns;

/*

****
***
**
*

 */

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Rows=");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
