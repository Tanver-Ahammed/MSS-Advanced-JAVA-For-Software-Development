package list.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>(); //create a Generic ArrayList

        stringArrayList.add("Tanver");
        stringArrayList.add("Sheuly");
        stringArrayList.add("Tarique");
        stringArrayList.add("Bonna");
        stringArrayList.add("Utsha");

        System.out.println("Traverse a LinkedList Normally");
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }

        //Traverse a list using Iterator
        Iterator<String> iterator = stringArrayList.iterator();
        System.out.println("\nTraverse a ArrayList using Iterator");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nTraverse ArrayList using ListIterator");
        ListIterator<String> listIterator = stringArrayList.listIterator(stringArrayList.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // forEach using
        System.out.println("\nforEach using:");
        stringArrayList.forEach(element ->     // here using lambda expression
                System.out.println(element));

        // sort the loop
        System.out.println("\nSort the ArrayList");
        Collections.sort(stringArrayList); // sort the ArrayList
        System.out.println(stringArrayList);




    }
}
