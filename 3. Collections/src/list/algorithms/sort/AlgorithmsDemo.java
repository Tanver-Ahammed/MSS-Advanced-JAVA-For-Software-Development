package list.algorithms.sort;

import java.util.*;

public class AlgorithmsDemo {

    public void execute() {

        List<Student> list = new ArrayList<>();

        Student student1 = new Student(105,360,20,"Bonna");
        list.add(student1);

        Student student2 = new Student(102,360,22,"Sheuly");
        list.add(student2);

        Student student3 = new Student(101,360,23,"Tarique");
        list.add(student3);

        Student student4 = new Student(104,390,21,"Tanver");
        list.add(student4);

        Student student5 = new Student(103,360,24,"Utsha");
        list.add(student5);


//        Student student6 = new Student(105,360,20,"bonna");
//        list.add(student6);
//
//        Student student7 = new Student(102,325,22,"sheuly");
//        list.add(student7);
//
//        Student student8 = new Student(101,214,23,"tarique");
//        list.add(student8);
//
//        Student student9 = new Student(104,390,21,"tanver");
//        list.add(student9);
//
//        Student student = new Student(103,250,24,"utsha");
//        list.add(student);






        System.out.println(list);

//        System.out.println("\nReverse Order:");
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);

        System.out.println("\nNatural Order:");
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);




        int index = Collections.binarySearch(list, student3);
        System.out.println(index);

    }

}
