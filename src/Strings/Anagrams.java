package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

     public static String sortString(String s){
        char c[]=s.toCharArray();
        Arrays.sort(c);
        String temp=new String(c);
        return temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First String");
        String s1=sc.nextLine();

        System.out.println("Enter Second String");
        String s2=sc.nextLine();

        if(s1.length()==s2.length()){
            s1=sortString(s1);
            s2=sortString(s2);

            if(s1.equals(s2)){
                System.out.println("Amagram");
            }else {
                System.out.println("Not Anagram");
            }
        }else {
            System.out.println("Not Anagram");
        }
    }
}
