package Constructors;

class Box{
    int length;
    int width;
    int height;
    Box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    void volume(){
        System.out.println("Volume of box ="+(length*width*height));
    }
}

public class EXthis {
    public static void main(String[] args){
        Box b1=new Box(10,20,30);
        b1.volume();
    }

}
