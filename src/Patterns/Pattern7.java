package Patterns;
/*

   1
  2 3
 4 5 6
7 8 9 10

 */

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Rows=");
        int n=sc.nextInt();

        int count=0;

        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }

    }
}
