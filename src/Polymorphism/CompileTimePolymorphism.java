package Polymorphism;

class Addition{
    void add(int a,int b){
        System.out.println("Sum = "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum = "+(a+b+c));
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args){

        Addition ob=new Addition();

        ob.add(10,20);
        ob.add(10,20,30);

    }
}
