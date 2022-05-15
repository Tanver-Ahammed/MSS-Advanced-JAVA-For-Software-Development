package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {
    public static void execute() {

        Map<Integer, Student> hashMap = new HashMap<>();

        Student s16 = new Student(19016, "Tanver", 20, 360);
        Student s17 = new Student(19017, "Sheuly", 20, 320);
        Student s18 = new Student(24, "Tariq", 20, 366);
        Student s19 = new Student(19019, "Bonna", 20, 310);
        Student s20 = new Student(19020, "Utsha", 20, 310);


        hashMap.put(10, s18);
        hashMap.put(19, s19);
        hashMap.put(20, s20);
        hashMap.put(16, s16);
        hashMap.put(17, s17);


        for (Map.Entry<Integer, Student> stu : hashMap.entrySet()) {
            int key = stu.getKey();
            Student s = stu.getValue();
            System.out.println(key + " Details:");
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge() + " " + s.getScore());
        }
        System.out.println(hashMap);
    }
}
