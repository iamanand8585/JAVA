package Interfaces;

public class Person implements Student,YouTuber {
    @Override
    public void study() {
        System.out.println("Person is studying");
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making video");

    }

    public static void main(String[] args){
        Person ob=new Person();
        ob.study();
        ob.makeVideo();
    }
}
