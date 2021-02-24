package ArrayLists;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args){

        //add() method
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits);


        //addAll() method
        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Tomato");
        fruits.addAll(vegetables);
        System.out.println(fruits);


        //get() method
        System.out.println(fruits.get(1));


        //set() method
        fruits.set(2,"Mango");
        System.out.println(fruits);


        //remove() method
        fruits.remove(3);
        System.out.println(fruits);


        //removeAll() method
        ArrayList<String> fruits1=new ArrayList<>();
        fruits1.add("Mango");
        fruits1.add("Orange");
        fruits.removeAll(fruits1);
        System.out.println(fruits);



        //clear() method
        fruits1.clear();
        System.out.println(fruits1);


        //size() method
        System.out.println(fruits.size());


        //contains() method
        System.out.println(fruits.contains("Apple"));


        //isEmpty() method
        System.out.println(fruits.isEmpty());


        //toArray() method
        String temp[]=new String[fruits.size()];
        fruits.toArray(temp);
        for (String e:temp){
            System.out.println(e);
        }


    }
}
