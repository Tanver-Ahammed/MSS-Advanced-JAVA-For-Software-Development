package map.treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Basic {
    public static void main(String[] args) {
        NavigableMap<Integer,String> map = new TreeMap<>();

        map.put(19017,"Sheuly");
        map.put(19018,"Tariq");
        map.put(19016,"Tanver");
        map.put(19019,"Bonna");
        map.put(19020,"Utsha");

        System.out.println(map);

        System.out.println("Deceasing Order: "+map.descendingMap());
        System.out.println("HeadMap: "+map.headMap(19018,true));
        System.out.println("TailMap: "+map.tailMap(19018));
        System.out.println("TailMap: "+map.tailMap(19018,true));
        System.out.println("subMap: "+map.subMap(19016,true, 19017,true));

    }
}
