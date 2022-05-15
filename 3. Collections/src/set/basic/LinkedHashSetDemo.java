package set.basic;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> students = new LinkedHashSet<>();  // LinkedHashSet created

        students.add("Tanver");
        students.add("Sheuly");
        students.add("Tariq");
        students.add("Bonna");
        students.add("Utsha");

        System.out.println(students);

        System.out.println("remove: " + students.remove("Utsha") + "\n");

        // traverse using iterator
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
