package map.hashmap;

import java.util.*;

public class Basic {
    public static void main(String[] args) {

        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap  = new TreeMap<>();

        hashMap.put(19,"Bonna");
        linkedHashMap.put(19,"Bonna");
        treeMap.put(19,"Bonna");

        hashMap.put(16,"Tanver");
        linkedHashMap.put(16,"Tanver");
        treeMap.put(16,"Tanver");

        hashMap.put(20,"Utsha");
        linkedHashMap.put(20,"Utsha");
        treeMap.put(20,"Utsha");

        hashMap.put(17,"Sheuly");
        linkedHashMap.put(17,"Sheuly");
        treeMap.put(17,"Sheuly");

        hashMap.put(18,"Tariq");
        linkedHashMap.put(18,"Tariq");
        treeMap.put(18,"Tariq");




        System.out.println(hashMap);
        System.out.println(linkedHashMap);
        System.out.println(treeMap);


    }
}
