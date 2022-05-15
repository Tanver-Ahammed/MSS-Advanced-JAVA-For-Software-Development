package map.sort;

import java.util.*;

public class MainMapSort {
    public static void main(String[] args) {

        Map<Student, String> hashMap = new HashMap<>();
        LinkedHashMap<Student, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Student, String> treeMap = new TreeMap<>();

        Student student1 = new Student(19019, "Bonna", 20, 355);
        hashMap.put(student1, "IT-19019");
        linkedHashMap.put(student1, "IT-19019");
        treeMap.put(student1, "IT-19019");

        Student student2 = new Student(19017, "Sheuly", 25, 350);
        hashMap.put(student2, "IT-19017");
        linkedHashMap.put(student2, "IT-19017");
        treeMap.put(student2, "IT-19017");

        Student student4 = new Student(19016, "Tanver", 20, 360);
        hashMap.put(student4, "IT-19016");
        linkedHashMap.put(student4, "IT-19016");
        treeMap.put(student4, "IT-19016");

        Student student5 = new Student(19020, "Utsha", 26, 321);
        hashMap.put(student5, "IT-19020");
        linkedHashMap.put(student5, "IT-19020");
        treeMap.put(student5, "IT-19020");

        Student student3 = new Student(19018, "Tariq", 23, 360);
        hashMap.put(student3, "IT-19018");
        linkedHashMap.put(student3, "IT-19018");
        treeMap.put(student3, "IT-19018");

        // insert null value in the Map
        Student student = new Student(19021, "Sajeeb", 36, 250);
        hashMap.put(student, null);
        linkedHashMap.put(student, null);
        treeMap.put(student, null);

        hashMap.put(null, "IT-19022");
        linkedHashMap.put(null, "IT-19022");
//        treeMap.put(null, "IT-19022");          // Not possible

        System.out.println("HashMap:");
        for (Student std : hashMap.keySet()) {
            System.out.println(std);
            System.out.println(hashMap.get(std));
            System.out.println();
        }

        System.out.println("\nLinkedHashMap:");
        for (Student std : linkedHashMap.keySet()) {
            System.out.println(std);
            System.out.println(linkedHashMap.get(std));
            System.out.println();
        }

        System.out.println("\nTreeMap:");
        for (Student std : treeMap.keySet()) {
            System.out.println(std);
            System.out.println(treeMap.get(std));
            System.out.println();
        }

        Student ss =  new Student(19021, "Sajeeb", 36, 250);
        System.out.println("Student Found ? : " + hashMap.containsKey(ss));
//        System.out.println(hashMap);
//        System.out.println(linkedHashMap);
//        System.out.println(treeMap);

    }
}
