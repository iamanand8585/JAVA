package Operators;

import java.util.Scanner;

public class BitwiseOperators {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        //Bitwise AND
        int bit_and=a&b;


        //Bitwise OR
        int bit_or=a|b;

        //Bitwise RIGHT Shift
        int bit_rightshift=a>>1;

        //Bitwise LEFT Shift
        int bit_leftshift=a<<1;

        //Bitwise XOR
        int bit_xor=a^b;

        System.out.println(bit_and);
        System.out.println(bit_or);
        System.out.println(bit_rightshift);
        System.out.println(bit_leftshift);
        System.out.println(bit_xor);


    }
}
