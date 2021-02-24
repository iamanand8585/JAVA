package ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args){
        try {
            int a[]=new int[5];
            System.out.println(a[5]);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+" occurred, please check your code");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()+" array length should be in range");
        }finally {
            System.out.println("Sorry for inconvenience");
        }
        System.out.println("Important code need to run");
    }
}
