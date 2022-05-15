package list.basic;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {

        //stack is Last in First Out (LIFO) Rules.

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Rakib");
        stringStack.push("Joy");

        List<String> stringList = new Stack<>();
        stringList.add("Tanver");
        stringList.add("Sheuly");
        stringList.add("Tarique");
        stringList.add("Bonna");

        Vector<String> stringVector = new Stack<>();
        stringVector.add("Utsha");
        stringVector.add("Shajeeb");
        stringVector.add("Arifa");

        // addAll() method call
        stringStack.addAll(stringList);
        stringStack.addAll(stringVector);

        // pop() Method call
        stringStack.pop();
        stringStack.pop();
        stringStack.pop();

        // Traverse a Stack  using Iterator
        Iterator<String> iterator = stringStack.iterator();
        System.out.println("\nTraverse a Vector  using Iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Peek Value: "+stringStack.peek());

    }
}
