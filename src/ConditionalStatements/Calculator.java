package ConditionalStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter First Number = ");
        int num1=sc.nextInt();

        System.out.print("Enter The Operation = ");
        sc.nextLine();
        char operation=sc.nextLine().charAt(0);

        System.out.print("Enter Second Number = ");
        int num2=sc.nextInt();

        int result=0;

        switch (operation){
            case '+':
                result=num1+num2;
                break;

            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("The Result = "+result);



    }

}
