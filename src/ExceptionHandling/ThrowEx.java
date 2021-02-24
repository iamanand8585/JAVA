package ExceptionHandling;

public class ThrowEx {
    public static void main(String[] args){

        int age=13;

        if(age<18){
            throw new ArithmeticException("Not eligible for voting");
        }else {
            System.out.println("Eligible for voting");
        }
        System.out.println("End of program");
    }
}
