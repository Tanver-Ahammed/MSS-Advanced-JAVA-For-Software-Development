package set;

import java.util.*;

public class Main {
    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Naju");
        list.add("Naju");
        list.add("Talha");
        list.add("Talha");
        list.add("Mou");
        list.add("Mou");
        list.add("Manha");
        list.add("Manha");

        System.out.println(list);
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();


//        set.add("Ravi");
//        set.add("Ravi");
//        set.add("Ajay");
//        set.add("Vijay");

        set.addAll(list);

        //Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(set);

    }
}