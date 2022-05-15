package enumsetmap;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
class EnumSetExample {
    public static void main(String[] args) {

        // enum specific properties
        System.out.println("enum specific properties:");
        Set<days> set = EnumSet.of(days.FRIDAY,days.SATURDAY,days.THURSDAY);

        Iterator<days> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // enum all properties
        System.out.println("\nenum all properties:");
        Set<days> set1 = EnumSet.allOf(days.class);
        Iterator<days> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }



    }
}