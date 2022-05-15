package set.setinterface;

import java.util.HashSet;

public class HashSetDemo {

    public static void execute() {

        HashSet<Student> hashSet = new HashSet<>();

        Student student1 = new Student(19016,"Tanver",20,360);
        Student student2 = new Student(19017,"Sheuly",22,320);
        Student student3 = new Student(19018,"Tariq",23,330);
        Student student4 = new Student(19019,"Utsha",20,310);
        Student student5 = new Student(19020,"Bonna",24,300);

        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student5);

        System.out.println("HashSet:");
        System.out.println(hashSet);



    }
}
