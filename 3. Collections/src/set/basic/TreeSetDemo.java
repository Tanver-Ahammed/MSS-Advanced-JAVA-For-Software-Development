package set.basic;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer>  set = new TreeSet<Integer>();  //TreeSet object created

        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);

        System.out.println(set);

        // traverse using iteration
        Iterator<Integer> integerIterator1 = set.iterator();
        while (integerIterator1.hasNext()) {
            System.out.println(integerIterator1.next());
        }
        System.out.println();
        // traverse using iteration
        Iterator<Integer> integerIterator2 = set.descendingIterator();
        while (integerIterator2.hasNext()) {
            System.out.println(integerIterator2.next());
        }



        // ceiling
        System.out.println("ceiling: " + set.ceiling(1));
        System.out.println("ceiling: " + set.ceiling(10));
        System.out.println("ceiling: " + set.ceiling(27));

        // floor
        System.out.println("floor: " + set.floor(24));
        System.out.println("floor: " + set.floor(-54));
        System.out.println("floor: " + set.floor(12));

        System.out.println("lower: " + set.lower(23));
        System.out.println("higher: " + set.higher(23));
        System.out.println();
        System.out.println("pollFirst: " + set.pollFirst());
        System.out.println("pollLast: " + set.pollLast());

    }
}
