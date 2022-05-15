package set.basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> stringHashSet = new HashSet<String>();   // HashSet created

        // add the elements
        stringHashSet.add("Tanver");
        stringHashSet.add("Sheuly");
        stringHashSet.add("Tariq");
        stringHashSet.add("Bonna");
        stringHashSet.add("Utsha");


        System.out.println(stringHashSet);

        // traverse using Iterator
        Iterator<String> stringIterator = stringHashSet.iterator();

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        HashSet cloneSet = new HashSet<>();

        // clone the elements
        cloneSet = (HashSet) stringHashSet.clone();

        System.out.println(cloneSet);

        //contains
        System.out.println("contains: " + cloneSet.contains("Utsha"));


        // remove
        System.out.println("remove: " + cloneSet.remove("Utsha"));


        // clear
        cloneSet.clear();

        // isEmpty
        System.out.println("IsEmpty: " + cloneSet.isEmpty());

        //size
        System.out.println("size: " + stringHashSet.size());

        //

    }
}
