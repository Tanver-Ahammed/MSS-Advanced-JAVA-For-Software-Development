package jtp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericCollections {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(12,"Talha");
        map.put(7,"Naju");
        map.put(6,"Rabbi");
        map.put(1,"Srithi");
        map.put(0,"Tanver");

        Set<Map.Entry<Integer,String>> set = map.entrySet();

        Iterator<Map.Entry<Integer,String>> iterator=set.iterator();

        while (iterator.hasNext()){
            Map.Entry e = iterator.next();

            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
