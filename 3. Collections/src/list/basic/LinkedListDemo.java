package list.basic;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> stringLinkedList = new LinkedList<>();  //create a LinkedList

        stringLinkedList.add("Tanver");
        stringLinkedList.add("Sheuly");
        stringLinkedList.add("Tarique");
        stringLinkedList.add("Bonna");
        stringLinkedList.add("Utsha");

        // Traverse a LinkedList Normally
        System.out.println("Traverse a LinkedList  Normally");
        for (String element: stringLinkedList) {
            System.out.println(element);
        }

        // Traverse a LinkedList using Iterator
        Iterator<String> iterator = stringLinkedList.iterator();
        System.out.println("\nTraverse a LinkedList  using Iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Traverse (Reverse) a LinkedList using Iterator
        Iterator<String> reverseIterator = stringLinkedList.descendingIterator();
        System.out.println("\nTraverse (Reverse) a LinkedList  using Iterator");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
