package map.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapStudent {
    public static void main(String[] args) {

        NavigableMap<Integer, Student> treeMap = new TreeMap<>();

        Student s1 = new Student(19016, "Tanver", 20);
        Student s2 = new Student(19017, "Sheuly", 28);
        Student s3 = new Student(19018, "Tariq", 15);
        Student s4 = new Student(19019, "Bonna", 21);
        Student s5 = new Student(19020, "Utsha", 13);

        treeMap.put(0,s1);
        treeMap.put(1,s2);
        treeMap.put(2,s3);
        treeMap.put(3,s4);
        treeMap.put(4,s5);

        for (Map.Entry e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println(treeMap.descendingMap());


    }
}
