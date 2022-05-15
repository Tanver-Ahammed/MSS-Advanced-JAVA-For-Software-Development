package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {
    public static void main(String[] args) {

        Map<Integer,String> fruits = new HashMap<>();

        fruits.put(101,"Mango");
        fruits.put(102,"Apple");
        fruits.put(103,"Banana");
        fruits.put(104,"Grapes");
        fruits.put(105,"Jack Fruit");

        System.out.println("Iterating Hashmap...");
        for (Map.Entry fruit : fruits.entrySet()) {
            System.out.println(fruit.getKey() + ":-> " + fruit.getValue());
        }

        // duplicate element
        fruits.put(104,"Bary");

        // replace
        fruits.replace(105,"Pine Apple");

        System.out.println(fruits.remove(101,"mango"));
        System.out.println("\nIterating Hashmap...");
        for (Map.Entry fruit : fruits.entrySet()) {
            System.out.println(fruit.getKey() + ":-> " + fruit.getValue());
        }



    }
}
