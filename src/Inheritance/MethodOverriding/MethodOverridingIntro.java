package Inheritance.MethodOverriding;

class A{
    void show(){
        System.out.println("show() of class A");
    }
}

class B extends A{
    void show(){
        //If you want show() of class A
        //super.show();
        System.out.println("show() of class B");
    }
}

public class MethodOverridingIntro {
    public static void main(String[] args){
        B ob=new B();
        ob.show();

    }
}
