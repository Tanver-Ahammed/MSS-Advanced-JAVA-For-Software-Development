package map.linkedhashmap;


import java.util.LinkedHashMap;
import java.util.Map;

public class Basic {
    public static void main(String[] args) {

        Map<String,String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Tanver","Kaitahar");
        linkedHashMap.put("Sheuly","Tangail");
        linkedHashMap.put("Tariq","Tangail");
        linkedHashMap.put("Bonna","Kagmari");
        linkedHashMap.put("Utsha","ShantiKunjo");

        System.out.println(linkedHashMap);

        for (Map.Entry entity : linkedHashMap.entrySet()) {
            System.out.println(entity.getKey()+ ":->  "+entity.getValue());
        }

        System.out.println("\nKeySet: \n" + linkedHashMap.keySet());
        System.out.println("\nValue: \n" + linkedHashMap.values());
    }
}
