package hashtable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<Integer, String>();
        map.put(19016, "Amit");
        map.put(19017, "Ravi");
//        map.put(19018, "Vijay");
//        map.put(19019, "Rahul");
//        map.put(19020, "Utsha");
        System.out.println("Initial Map: " + map);
        //Inserts, as the specified pair is unique
        map.putIfAbsent(104, "Gaurav");
        System.out.println("Updated Map: " + map);
        //Returns the current value, as the specified pair already exist
        map.putIfAbsent(101, "Vijay");
        System.out.println("Updated Map: " + map);
    }
}