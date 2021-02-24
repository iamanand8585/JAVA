package Abstraction;

public class AbstractionIntro {
    public static void repair(Car car){
        System.out.println("Car is repaired");
    }

    public static void main(String[] args){
        WagonR wagonr=new WagonR();
        Audi audi=new Audi();

        repair(wagonr);
        repair(audi);

    }
}
