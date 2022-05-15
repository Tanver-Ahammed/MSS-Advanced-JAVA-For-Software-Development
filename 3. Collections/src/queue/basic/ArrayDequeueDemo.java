package queue.basic;


import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.offer("Tanver");
        deque.offer("Sheuly");
        deque.offer("Tariq");

        deque.offerFirst("Joy");
        deque.offerLast("Bonna");

        deque.addLast("Utsha");

        System.out.println(deque.removeLast());

        System.out.println(deque.pollFirst());

        System.out.println(deque);
    }
}
