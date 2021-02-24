package Inheritance;

class RoomArea{
    int length;
    int breadth;
    RoomArea(int l,int b){
        length=l;
        breadth=b;
    }

    void area(){
        System.out.println("Area = "+(length*breadth));
    }
}

class RoomVolume extends RoomArea{
    int height;
    RoomVolume(int l,int b,int h){
        super(l,b);
        height=h;
    }
    void volume(){
        System.out.println("Volume = "+(length*breadth*height));
    }
}

public class SingleInheritance {
    public static void main(String[] args){
        RoomVolume r=new RoomVolume(10,20,30);

        r.area();
        r.volume();


    }
}
