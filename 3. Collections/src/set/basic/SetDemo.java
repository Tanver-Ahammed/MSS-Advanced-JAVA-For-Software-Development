package set.basic;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        // HashSet
        Set<String> hashSet = new HashSet<>();  // HashSet class created
        hashSet.add("Tanver");
        hashSet.add("Sheuly");
        hashSet.add("Tarique");
        hashSet.add("Bonna");
        hashSet.add("Utsha");

        //Traversing elements using Iterator
        Iterator<String> hashIterator = hashSet.iterator();
        while (hashIterator.hasNext()) {
            System.out.println(hashIterator.next());
        }
        System.out.println();

        // LinkedListSet
        Set<String> linkedListSet = new LinkedHashSet<>();  // LinkedListSet class created
        linkedListSet.add("Tanver");
        linkedListSet.add("Sheuly");
        linkedListSet.add("Tarique");
        linkedListSet.add("Bonna");
        linkedListSet.add("Utsha");
        //Traversing elements using Iterator
        Iterator<String> linkedListIterator = linkedListSet.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }
        System.out.println();

        //TreeSet
        Set<String> treeSet = new TreeSet<>();  // TreeSet class created
        treeSet.add("Tanver");
        treeSet.add("Sheuly");
        treeSet.add("Tarique");
        treeSet.add("Bonna");
        treeSet.add("Utsha");
        //Traversing elements using Iterator
        Iterator<String> treeIterator = treeSet.iterator();
        while (treeIterator.hasNext()) {
            System.out.println(treeIterator.next());
        }
        System.out.println();
        
        // SortedSet Interface

        SortedSet<Integer> integers = new TreeSet<>();
        integers.add(258);
        integers.add(-98);
        integers.add(65);
        integers.add(565);
        integers.add(1);
        integers.add(654);
        integers.add(-48);
        System.out.println(integers);

    }
}
