package set.setinterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
    public static void execute() {

        HashSet<Student> hashSet = new HashSet<>();

        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();

        TreeSet<Student> treeSet = new TreeSet<>();

        Student student1 = new Student(19016,"Tanver",20,360);
        hashSet.add(student1);
        linkedHashSet.add(student1);
        treeSet.add(student1);

        Student student2 = new Student(19017,"Sheuly",22,320);
        hashSet.add(student2);
        linkedHashSet.add(student2);
        treeSet.add(student2);

        Student student3 = new Student(19018,"Tariq",23,330);
        hashSet.add(student3);
        linkedHashSet.add(student3);
        treeSet.add(student3);

        Student student4 = new Student(19019,"Utsha",20,310);
        hashSet.add(student4);
        linkedHashSet.add(student4);
        treeSet.add(student4);

        Student student5 = new Student(19020,"Bonna",24,360);
        hashSet.add(student5);
        linkedHashSet.add(student5);
        treeSet.add(student5);

        hashSet.add(null);
        linkedHashSet.add(null);
//        treeSet.add(null);

        System.out.println("HashSet:");
        System.out.println(hashSet);

        System.out.println("\nLinkedHashSet:");
        System.out.println(linkedHashSet);

        System.out.println("\nTreeSet");
        System.out.println(treeSet);

        // clear the sets
        hashSet.clear();
        linkedHashSet.clear();
        treeSet.clear();

        System.out.println("HashSet:");
        System.out.println(hashSet);

        System.out.println("\nLinkedHashSet:");
        System.out.println(linkedHashSet);

        System.out.println("\nTreeSet");
        System.out.println(treeSet);
    }
}
