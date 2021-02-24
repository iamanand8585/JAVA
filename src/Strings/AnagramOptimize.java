package Strings;


import java.util.Scanner;

public class AnagramOptimize {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First String");
        String s1=sc.nextLine();

        System.out.println("Enter Second String");
        String s2=sc.nextLine();

        boolean val=true;

        int a[]=new int[256];

        for (char c:s1.toCharArray()){
            int index=(int)c;
            a[index]++;
        }

        for(char c:s2.toCharArray()){
            int index=(int)c;
            a[index]--;
        }

        for (int i:a){
            if(i!=0){
                val=false;
                break;
            }
        }
        if(val==true){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }

    }
}
