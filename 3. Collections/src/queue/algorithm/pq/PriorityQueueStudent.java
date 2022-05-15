package queue.algorithm.pq;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueStudent {

    public static void execute() {

        Queue<Student> students = new PriorityQueue<>();

        Student student1 = new Student(19016,"Tanver",20,360);
        Student student2 = new Student(19017,"Sheuly",25,210 );
        Student student3 = new Student(19018,"Tariq",23,351);
        Student student4 = new Student(19019,"Bonna",20,210);
        Student student5 = new Student(19020,"Utsha",24,205);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);

        System.out.println(students.remove());
    }
}
