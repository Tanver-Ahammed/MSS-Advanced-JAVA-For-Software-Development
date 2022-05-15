package map;

import java.util.*;

public class Test {
    public static <K, V> Set<K> getKeys(Map<K, V> map, V value) {
        Set<K> keys = new HashSet<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(16, "Tanver");
        map.put(19, "Bonna");
        map.put(17, "Sheuly");
        map.put(20, "Utsha");
        map.put(18, "Tariq");
        map.put(21, "Sajeeb");
        map.put(22, "Arifa");

        System.out.println(map);

        System.out.println(getKeys(map, "Tanver"));

        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        Set set = map.entrySet();

        for (Map.Entry<Integer,String> element : map.entrySet()) {
            System.out.println(element.getKey() + ": " + element.getValue());
        }



        // -------------------------comparing------------------------------------
        // comparingByKey ASC Order
        System.out.println("\ncomparingByKey ASC Order:");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        // comparingByKey DSC order
        System.out.println("\ncomparingByKey DSC order:");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);

        // comparingByValue ASC order
        System.out.println("\ncomparingByValue ASC order:");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .forEach(System.out::println);

        // comparingByValue DSC order
        System.out.println("\ncomparingByValue DSC order:");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);



    }
}
