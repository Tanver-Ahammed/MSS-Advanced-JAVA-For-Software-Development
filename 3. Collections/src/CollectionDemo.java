import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();

        list.add("JAVA");
        list.add("Core JAVA");
        list.add("Advanced JAVA");
        System.out.println("Initial collection value:\n"+list);

        Collections.addAll(list,"JSP","Servlet");
        System.out.println("\nAfter addAll Collection element:\n"+list);

        String [] st = {"C","C++","C#"};
        Collections.addAll(list,st);
        System.out.println("\nAfter Add Array: \n"+list);

        System.out.println("\nMax value: "+Collections.max(list));

        System.out.println("\nMin value: "+Collections.min(list));


        System.out.println();
        //--------------------------------------------------------------------
        List<String> al = new ArrayList<>();
        al.add("JAVA");
        al.add("C");
        al.add("Python");
        al.add("C#");
        al.add("JavaScript");
        al.add("C++");

        Collections.sort(al,Comparator.reverseOrder());
        System.out.println(al);


        //-----------------------------------------------------------------------

        Set<Integer>set = new HashSet<>();
        Set<Integer>treeSet = new TreeSet<>();

        set.add(25);
        set.add(12);
        set.add(255);
        set.add(92);
        set.add(65);
        System.out.println(set);

        treeSet.addAll(set);
        System.out.println(treeSet);
        System.out.println(Collections.max(treeSet));
        System.out.println(Collections.min(treeSet));



    }
}
