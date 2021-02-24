package Generics;

class Test<X,Y>{
    X x;
    Y y;

    Test(X x,Y y){
        this.x=x;
        this.y=y;

    }

    void description(){
        System.out.println(x+" and "+y);
    }

}

public class GenericsIntro{
    public static void main(String[] args){
        Test<Integer,String> ob=new Test<>(1,"One");
        ob.description();

    }

}
