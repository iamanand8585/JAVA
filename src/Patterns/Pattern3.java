package Patterns;

/*

****
 ***
  **
   *

 */

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Rows=");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for (int k=1;k<=n-i;k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
