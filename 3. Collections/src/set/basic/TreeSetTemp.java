package set.basic;

import java.util.TreeSet;

public class TreeSetTemp {
    public static void main(String[] args) {

        TreeSet<String> stringTreeSet = new TreeSet<>();

        stringTreeSet.add("A");
        stringTreeSet.add("B");
        stringTreeSet.add("C");
        stringTreeSet.add("D");
        stringTreeSet.add("E");

        System.out.println("intaial set: " + stringTreeSet);

        System.out.println("Reverse Set: "+stringTreeSet.descendingSet());

        System.out.println("Head Set: "+stringTreeSet.headSet("D", true));

        System.out.println("SubSet: "+stringTreeSet.subSet("A", false, "E", true));

        System.out.println("TailSet: "+stringTreeSet.tailSet("C", false));

    }
}
