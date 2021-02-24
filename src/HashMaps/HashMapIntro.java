package HashMaps;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args){
        HashMap<String,Integer> numbers=new HashMap<>();

        //put() method
        numbers.put("One",1);
        numbers.put("Two",2);
        System.out.println(numbers);

        //putAll() method
        HashMap<String,Integer> numbers1=new HashMap<>();
        numbers1.put("Three",3);
        numbers1.put("Four",4);
        numbers.putAll(numbers1);
        System.out.println(numbers);

        //putIfAbsent() method
        numbers.putIfAbsent("One",10);
        System.out.println(numbers);
        numbers.putIfAbsent("Five",5);
        System.out.println(numbers);

        //get() method
        System.out.println(numbers.get("Five"));

        //getOrDefault() method
        System.out.println(numbers.getOrDefault("Ten",0));

        //containsKey() method
        System.out.println(numbers.containsKey("One"));

        //containsValue() method
        System.out.println(numbers.containsValue(3));

        //replace() method
        numbers.replace("Five",10);
        System.out.println(numbers);

        //replace(K,oldValue,newValue) method
        numbers.replace("Five",10,5);
        System.out.println(numbers);

        //keySet() method
        System.out.println(numbers.keySet());

        //values() method
        System.out.println(numbers.values());

        //entrySet() method
        System.out.println(numbers.entrySet());


    }
}
