package list.vector;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;


public class Basic {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Tanver");
        vector.add("Bonna");
        vector.add("Dona");

        Collections.sort(vector, Comparator.reverseOrder());


        System.out.println(vector);


    }
}
