package set.setinterface;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void execute() {

        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();

        Student student1 = new Student(19016,"Tanver",20,360);
        Student student2 = new Student(19017,"Sheuly",22,320);
        Student student3 = new Student(19018,"Tariq",23,330);
        Student student4 = new Student(19019,"Utsha",20,310);
        Student student5 = new Student(19020,"Bonna",24,300);

        linkedHashSet.add(student1);
        linkedHashSet.add(student2);
        linkedHashSet.add(student3);
        linkedHashSet.add(student4);
        linkedHashSet.add(student5);

        System.out.println("\nLinkedHashSet:");
        System.out.println(linkedHashSet);

    }
}
