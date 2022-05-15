package set.setinterface;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void execute() {

        TreeSet<Student> treeSet = new TreeSet<>();

        Student student1 = new Student(19016,"Tanver",20,360);
        Student student2 = new Student(19017,"Sheuly",22,320);
        Student student3 = new Student(19018,"Tariq",23,330);
        Student student4 = new Student(19019,"Utsha",20,310);
        Student student5 = new Student(19020,"Bonna",24,300);

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);

        System.out.println("\nTreeSet:");
        System.out.println(treeSet);



    }
}
