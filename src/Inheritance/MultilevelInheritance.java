package Inheritance;

class RoomArea1{
    int length;
    int breadth;
    RoomArea1(int l,int b){
        length=l;
        breadth=b;
    }

    void area(){
        System.out.println("Area = "+(length*breadth));

    }
}

class RoomVolume1 extends RoomArea1{
    int height;
    RoomVolume1(int l,int b,int h){
        super(l,b);
        height=h;
    }

    void volume(){
        System.out.println("Volume = "+(length*breadth*height));
    }
}

class RoomColor extends RoomVolume1{
    String color;
    RoomColor(int l,int b,int h,String c){
        super(l,b,h);
        color=c;
    }
    void display(){
        System.out.println("Color = "+color);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args){
        RoomColor r=new RoomColor(10,20,30,"Green");
        r.area();
        r.volume();
        r.display();
    }
}
