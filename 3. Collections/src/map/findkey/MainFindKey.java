package map.findkey;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainFindKey {
    public static void main(String[] args) {

        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();

        hashMap.put(19016,"Md. Tanver Ahammed");
        hashMap.put(19017,"Sheuly Akter");
        hashMap.put(19018,"Tarakul Islam Tariq");
        hashMap.put(19019,"Fatema Tuz jahura Bonna");
        hashMap.put(19020,"Shazid Mostofa Utsha");


        System.out.println(hashMap);
        System.out.println(hashMap.get(16));
        System.out.println(FindKey.getKeys(hashMap,"Md. Tanver Ahammed"));
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.containsKey(19018));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.toString());
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(19019));
        // Traverse
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // LinkedHashMap
        System.out.println("\nLinkedHashMap: ");
        linkedHashMap.put(19016,"Md. Tanver Ahammed");
        linkedHashMap.put(19017,"Sheuly Akter");
        linkedHashMap.put(19018,"Tarakul Islam Tariq");
        linkedHashMap.put(19019,"Fatema Tuz jahura Bonna");
        linkedHashMap.put(19020,"Shazid Mostofa Utsha");


        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(16));
        System.out.println(FindKey.getKeys(linkedHashMap,"Md. Tanver Ahammed"));
        System.out.println(linkedHashMap.entrySet());
        System.out.println(linkedHashMap.containsKey(19018));
        System.out.println(linkedHashMap.keySet());
        System.out.println(linkedHashMap.values());
        System.out.println(linkedHashMap.toString());
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap.get(19019));
        // Traverse
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
