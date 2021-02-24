package OOPS;

class Dog{
    String breed,name;
    int leg;
    public void jump(){
        System.out.println("My Dog  "+name+" Jump");
    }
    public void description(){
        System.out.println("My Dog's breed is "+breed+" and it has "+leg+" legs");
    }
}

public class MainClass {
    public static void main(String[] args){
        Dog d1=new Dog();
        Dog d2=new Dog();

        d1.breed="Huskey";
        d1.name="Bruno";
        d1.leg=4;

        d2.breed="Poodle";
        d2.name="Tom";
        d2.leg=3;

        d1.jump();
        d1.description();

        d2.jump();
        d2.description();
    }
}
