package Inheritance;

class Person{
    String name;
    void eat(){
        System.out.println(name+" eat");
    }
    void walk(){
        System.out.println(name+" walk");
    }
}

class Teacher extends Person{

    void teach(){
        System.out.println("Teacher teaches");
    }

}

class Singer extends Person{
    void sing(){
        System.out.println("Singer sings");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args){
        Teacher t=new Teacher();
        t.name="Mr. Harry";
        t.eat();
        t.walk();
        t.teach();

        Singer s=new Singer();
        s.name="Mr. Singh";
        s.eat();
        s.walk();
        s.sing();
    }
}
