package Constructors;

class House{
    int length;
    int breadth;
    int height;

    House(){
        length=-1;
        breadth=-1;
        height=-1;
    }

    House(int a){
        length=breadth=height=a;
    }

    House(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }

    void volume(){
        System.out.println("Volume of House = "+(length*breadth*height));
    }
}

public class ConstructorOverloading {
    public static void main(String[] args){
        House h1=new House();
        House h2=new House(10);
        House h3=new House(20,30,50);

        h1.volume();
        h2.volume();
        h3.volume();
    }
}
