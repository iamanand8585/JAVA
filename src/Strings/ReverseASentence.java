package Strings;

import java.util.Scanner;

public class ReverseASentence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence");
        String s=sc.nextLine();

        String reverse="";

        int i=s.length()-1;

        while(i>=0){
            while (i>=0 && s.charAt(i)==' '){
                i--;
            }

            int j=i;

            if(i<0){
                break;
            }

            while (i>=0 && s.charAt(i)!=' '){
                i--;
            }


            if(reverse.isEmpty()){
                reverse=reverse+s.substring(i+1,j+1);
            }else {
                reverse=reverse+' '+s.substring(i+1,j+1);
            }

        }
        System.out.println("Reversed Sentence");
        System.out.println(reverse);
    }
}
