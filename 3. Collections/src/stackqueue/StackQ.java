package stackqueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQ {
    public static void main(String[] args) {

        Queue<String> lq = new LinkedList<>();

        Queue<String> pq = new PriorityQueue<>();

        Stack<String> st = new Stack<>();

        lq.add("JAVA");
        pq.add("JAVA");
        st.push("JAVA");

        lq.add("R");
        pq.add("R");
        st.push("R");


        lq.add("C#");
        pq.add("C#");
        st.push("C#");

        lq.add("Kotlin");
        pq.add("Kotlin");
        st.push("Kotlin");

        lq.add("C++");
        pq.add("C++");
        st.push("C++");

        lq.add("JS");
        pq.add("JS");
        st.push("JS");

        lq.add("PHP");
        pq.add("PHP");
        st.push("PHP");

        lq.add("C");
        pq.add("C");
        st.push("C");

        lq.add("Ruby");
        pq.add("Ruby");
        st.push("Ruby");

        lq.add("Python");
        pq.add("Python");
        st.push("Python");


        System.out.println("LinkedList Q    : " + lq);
        System.out.println("PriorityQueue Q : " + pq);
        System.out.println("Stack           : " + st);
        System.out.println();

        System.out.println("LinkedList Q    : " + lq.remove());
        System.out.println("PriorityQueue Q : " + pq.remove());
        System.out.println("Stack           : " + st.pop());
        System.out.println();

        System.out.println("LinkedList Q    : " + lq.remove());
        System.out.println("PriorityQueue Q : " + pq.remove());
        System.out.println("Stack           : " + st.pop());
        System.out.println();

        System.out.println("LinkedList Q    : " + lq.remove());
        System.out.println("PriorityQueue Q : " + pq.remove());
        System.out.println("Stack           : " + st.pop());
        System.out.println();

        System.out.println("LinkedList Q    : " + lq.remove());
        System.out.println("PriorityQueue Q : " + pq.remove());
        System.out.println("Stack           : " + st.pop());
        System.out.println();

        System.out.println("LinkedList Q    : " + lq.remove());
        System.out.println("PriorityQueue Q : " + pq.remove());
        System.out.println("Stack           : " + st.pop());
        System.out.println();

        System.out.println("LinkedList Q    : " + lq.remove());
        System.out.println("PriorityQueue Q : " + pq.remove());
        System.out.println("Stack           : " + st.pop());
        System.out.println();

        System.out.println("LinkedList Q    : " + lq.remove());
        System.out.println("PriorityQueue Q : " + pq.remove());
        System.out.println("Stack           : " + st.pop());
        System.out.println();

        System.out.println("LinkedList Q    : " + lq.remove());
        System.out.println("PriorityQueue Q : " + pq.remove());
        System.out.println("Stack           : " + st.pop());
        System.out.println();

        System.out.println("LinkedList Q    : " + lq.remove());
        System.out.println("PriorityQueue Q : " + pq.remove());
        System.out.println("Stack           : " + st.pop());
        System.out.println();

        System.out.println("LinkedList Q    : " + lq.remove());
        System.out.println("PriorityQueue Q : " + pq.remove());
        System.out.println("Stack           : " + st.pop());
        System.out.println();

        System.out.println("LinkedList Q isEmpty    ? : " + lq.isEmpty());
        System.out.println("PriorityQueue Q isEmpty ? : " + pq.isEmpty());
        System.out.println("Stack isEmpty           ? : " + st.isEmpty());
        System.out.println();


    }
}