package queue.algorithm.aq;

import java.util.*;

public class ArrayDequeueStudent {

    public static void execute() {

        Deque<Student> students = new ArrayDeque<>();


        Student student1 = new Student(19016,"Tanver",20,360);
        Student student2 = new Student(19017,"Sheuly",25,210 );
        Student student3 = new Student(19018,"Tariq",23,351);
        Student student4 = new Student(19019,"Bonna",20,210);
        Student student5 = new Student(19020,"Utsha",24,205);

        students.offer(student2);
        students.offer(student3);
        students.offer(student4);
        students.offer(student5);

        students.offerLast(student1);

        System.out.println(students);

        System.out.println(students.remove());


//        //-----------------------------------------------------------------
//        System.out.println();
//        List<Student> list = new ArrayList<>();
//        list.add(student1);
//        list.add(student2);
//        list.add(student3);
//        list.add(student4);
//        list.add(student5);
//        Collections.sort(list);
//        System.out.println(list);

    }
}
