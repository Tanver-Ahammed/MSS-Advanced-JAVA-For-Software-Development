package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Basic {
    public static void main(String[] args) {

        Hashtable<Integer,String> hashtable = new Hashtable<>();

        hashtable.put(19016,"Tanver");
        hashtable.put(19017,"Sheuly");
        hashtable.put(19018,"Tariq");
        hashtable.put(19019,"Bonna");
        hashtable.put(19020,"Utsha");

        System.out.println(hashtable);

        for(Map.Entry m:hashtable.entrySet()){
            System.out.println(m.getKey()+": "+m.getValue());
        }

        System.out.println(hashtable.getOrDefault(19019,"NOT FOUND"));
        System.out.println(hashtable.getOrDefault(19015,"NOT FOUND"));

    }
}
