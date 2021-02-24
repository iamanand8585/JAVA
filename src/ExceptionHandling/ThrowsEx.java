package ExceptionHandling;

public class ThrowsEx {
    static int division(int a,int b) throws ArithmeticException{
        int t=a/b;
        return t;
    }

    public static void main(String[] args){
        try {
            System.out.println(division(5,0));
        }catch (ArithmeticException e){
            System.out.println("can't be divided by zero");
        }
    }
}
