package queue.basic;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue<String> priorityQueue= new PriorityQueue<>();

        priorityQueue.add("Tanver");
        priorityQueue.add("Sheuly");
        priorityQueue.add("Tariq");
        priorityQueue.add("Bonna");
        priorityQueue.add("Utsha");

        System.out.println(priorityQueue);
        System.out.println("head: " + priorityQueue.element());
        System.out.println("head: " + priorityQueue.peek());
        System.out.println("head: " + priorityQueue.poll());

        // remove
        System.out.println("remove: " + priorityQueue.remove());

        //poll
        System.out.println("poll: " + priorityQueue.poll());


    }
}
