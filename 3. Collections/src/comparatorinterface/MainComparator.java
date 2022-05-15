package comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparator {
    public static void main(String[] args) {




    ArrayList<Student> arrayList = new ArrayList<>();

        Student s16 = new Student(19016, "Tanver", 20, 360);
        Student s17 = new Student(19017, "Sheuly", 25, 320);
        Student s18 = new Student(19024, "Tariq", 12, 366);
        Student s19 = new Student(19019, "Bonna", 35, 310);
        Student s20 = new Student(19020, "Utsha", 19, 310);

        arrayList.add(s16);
        arrayList.add(s17);
        arrayList.add(s18);
        arrayList.add(s19);
        arrayList.add(s20);

        System.out.println("Sorting by Age:");
        Collections.sort(arrayList, new AgeComparator().reversed());
        System.out.println(arrayList);

        System.out.println("\n");

        System.out.println("Sorting by Name:");
        Collections.sort(arrayList, new NameComparator());
        System.out.println(arrayList);
    }
}
