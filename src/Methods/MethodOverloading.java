package Methods;

class Demo{
    void test(){
        System.out.println("No Parameters");
    }
    void test(int a){
        System.out.println("a:"+a);
    }
    void test(int a,int b){
        System.out.println("a:"+a+" b:"+b);
    }

}

public class MethodOverloading {
    public static void main(String[] args){
        Demo ob=new Demo();

        ob.test();
        ob.test(10);
        ob.test(5,15);
    }
}
