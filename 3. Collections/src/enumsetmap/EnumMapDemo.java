package enumsetmap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {

    public enum days {
        SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    public static void main(String[] args) {

        Map<days,String> map = new EnumMap<days, String>(days.class);

        map.put(days.SATURDAY,"1");
        map.put(days.SUNDAY,"2");
        map.put(days.MONDAY,"3");
        map.put(days.TUESDAY,"4");
        map.put(days.WEDNESDAY,"5");
        map.put(days.THURSDAY,"6");
        map.put(days.FRIDAY,"7");

        for (Map.Entry day : map.entrySet()) {
            System.out.println(day.getKey() + ": " + day.getValue());
        }
    }
}
