package Arrays;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows=");
        int row=sc.nextInt();

        System.out.print("Enter the number of columns=");
        int column=sc.nextInt();

        int matrix1[][]=new int[row][column];

        int matrix2[][]=new int[row][column];

        System.out.println("Enter elements of First Matrix");
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter elements of Second Matrix");
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }

        int matrixSum[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matrixSum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        System.out.println("Matrix Sum");
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(matrixSum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
