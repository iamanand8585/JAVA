package Methods;

public class TrickPassByValueInCaseOfNonPrimitive {
    public static void main(String[] args){
        Dog a=new Dog();
        a.leg=4;
        changeDog(a);

        System.out.println(a.leg);


    }

    static void changeDog(Dog dog){
        dog.leg=6;
    }

}

class Dog{
    int leg;
}
