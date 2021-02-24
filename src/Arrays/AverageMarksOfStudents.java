package Arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Students=");
        int n=sc.nextInt();

        int marks[]=new int[n];

        System.out.println("Enter Marks:");
        for (int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }

        int sum=0;
        for (int i=0;i<n;i++){
            sum+=marks[i];
        }
        float avg=sum/n;
        System.out.print("Average Marks="+avg);
    }
}
