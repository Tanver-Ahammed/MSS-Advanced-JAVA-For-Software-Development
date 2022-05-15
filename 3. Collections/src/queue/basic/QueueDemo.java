package queue.basic;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        System.out.println("ArrayDequeue:-->\n");
        Queue<String> arrayDeque = new ArrayDeque<>();  // ArrayDeque Queue created
        arrayDeque.add("Tanver");
        arrayDeque.add("Sheuly");
        arrayDeque.add("Tarique");
        arrayDeque.add("Bonna");
        arrayDeque.add("Utsha");

        System.out.println("Dequeue/Remove Item: " + arrayDeque.remove());

        // Traverse the ArrayDeque using Iteration
        Iterator<String> iterator = arrayDeque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Deque:-->\n");
        Deque<String> stringArrayDeque = new ArrayDeque<>();  // ArrayDeque Queue created
        stringArrayDeque.add("Tanver");
        stringArrayDeque.add("Sheuly");
        stringArrayDeque.add("Tarique");
        stringArrayDeque.add("Bonna");
        stringArrayDeque.add("Utsha");

        System.out.println("Dequeue/Remove Item: " + arrayDeque.remove());

        // Traverse the ArrayDeque using Iteration
        Iterator<String> iteratorDeque = stringArrayDeque.iterator();
        while (iteratorDeque.hasNext()) {
            System.out.println(iteratorDeque.next());
        }



        System.out.println("\n\nPriorityQueue:-->\n");

        // A value which priority is low which is removed first
        Queue<String> priorityQueue = new PriorityQueue<>(); // priorityDequeue created


        priorityQueue.add("Tanver");
        priorityQueue.add("2");
        priorityQueue.add("3");
        priorityQueue.add("4");
        priorityQueue.add("5");

        System.out.println("Dequeue/Remove Item: " + priorityQueue.remove());

        for (String element : priorityQueue) {
            System.out.println(element);
        }
    }
}
