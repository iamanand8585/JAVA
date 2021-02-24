package Polymorphism;

class ABC{
    void show(){
        System.out.println("Overridden Method");
    }
}

class XYZ extends ABC{
    void show(){
        System.out.println("Overriding Method");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args){
        ABC ob=new XYZ();

        ob.show();

    }
}
