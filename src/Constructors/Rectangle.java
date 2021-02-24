package Constructors;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }

    void area(){
        System.out.println("Area = "+(length*breadth));
    }

    public static void main(String[] args){

        Rectangle r1=new Rectangle(10,20);
        Rectangle r2=new Rectangle(50,30);

        r1.area();
        r2.area();


    }
}
