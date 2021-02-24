package ExceptionHandling;

public class ExceptionIntro {
    public static void main(String[] args){
        try {
            int a=5;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+" occurred, please check your code");
        }
        System.out.println("Important code need to run");
    }
}
