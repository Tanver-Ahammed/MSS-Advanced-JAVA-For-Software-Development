package list.algorithms.equalsMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EqualsAlgorithms {
    public static void execute() {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student(19016,"Tanver",80);
        Student student2 = new Student(19017,"Sheuly",70);
        Student student3 = new Student(19018,"Tariq",60);
        Student student4 = new Student(19019,"Bonna",50);
        Student student5 = new Student(19020,"Utsha",40);

        studentList.add(student5);
        studentList.add(student4);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList);

        // search other reference or object
        Student searchStudent = new Student(19019,"Bonna",50);

        System.out.println(studentList.contains(searchStudent));

        System.out.println(studentList.indexOf(searchStudent));

        // sort the ListDemo
        Collections.sort(studentList, Comparator.naturalOrder());

        System.out.println(studentList);

        System.out.println(studentList.contains(searchStudent));

        System.out.println(studentList.indexOf(searchStudent));


    }
}
