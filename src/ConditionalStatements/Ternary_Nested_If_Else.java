package ConditionalStatements;

public class Ternary_Nested_If_Else {
    public static void main(String[] args){
        int a=12,b=8,c=10;
        int result=0;
        result=(a>b)?(a>c)?a:c:(b>c)?b:c;
        System.out.println("Largest of three number is "+result);
    }
}
