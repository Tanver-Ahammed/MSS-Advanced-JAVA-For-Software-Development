package map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapStudent {
    public static void main(String[] args) {

        Map<Integer,Student> studentLinkedHashMap = new LinkedHashMap<>();

        Student s1 = new Student(19016,"Tanver",20);
        Student s2 = new Student(19017,"Sheuly",22);
        Student s3 = new Student(19018,"Tariq",23);
        Student s4 = new Student(19019,"Bonna",21);
        Student s5 = new Student(19020,"Utsha",24);

        studentLinkedHashMap.put(1,s1);
        studentLinkedHashMap.put(2,s2);
        studentLinkedHashMap.put(3,s3);
        studentLinkedHashMap.put(4,s4);
        studentLinkedHashMap.put(5,s5);

        System.out.println(studentLinkedHashMap);

        Student containStudent = new Student(19016,"Tanver",20);
        System.out.println(studentLinkedHashMap.containsValue(containStudent));

    }
}
