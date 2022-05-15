package list.basic;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        List<String> stringList = new Vector<>(); //Vector Created

        stringList.add("Tanver");
        stringList.add("Sheuly");
        stringList.add("Tarique");
        stringList.add("Bonna");
        stringList.add("Utsha");

        // Traverse a LinkedList  Normally
        System.out.println("Traverse a Vector  Normally");
        for (String element: stringList) {
            System.out.println(element);
        }

        // Traverse a LinkedList  using Iterator
        Iterator<String> iterator = stringList.iterator();
        System.out.println("\nTraverse a Vector  using Iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
