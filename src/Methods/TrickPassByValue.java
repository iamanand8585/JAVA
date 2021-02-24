package Methods;

public class TrickPassByValue {
    public static void main(String[] args){
        int c=2;
        int d=3;

        swap(c,d);

        System.out.println("c:"+c+" d:"+d);


    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
