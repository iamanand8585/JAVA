package Encapsulation;

public class Student {

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){

        if(age>20){
            System.out.println("You are too old to be a student in our School");
        }else {
            this.age=age;
        }
    }

}
