package Patterns;

/*

*
**
***
****
***
**
*

 */

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Row=");
        int n=sc.nextInt();
        int count=0;
        for (int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }else {
                count++;
                for(int k=1;k<=n-count;k++){
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
