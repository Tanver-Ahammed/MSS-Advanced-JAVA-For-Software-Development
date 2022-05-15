package byBook.unboundedWildCards;

import java.time.LocalDate;
import java.util.List;

public class UsingWildCards {
    public static void process(List<?> list) {
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Tanver"));
        list.forEach(o -> {});

        for (Object object : list) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        List<Integer>integerList=List.of(1,2,3,4,5,6,7,8,9,10);
        process(integerList);

        List<Double>doubleList=List.of(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,11.0);
        process(doubleList);

        List<String>stringList = List.of("Tanver","Sheuly","Tarique","Bonna","Utsha");
//        stringList.add("Tanver");     //Error java.lang.UnsupportedOperationException
        process(stringList);

        List<?>unknown = List.of("MAD","FTZB","SRITHI", LocalDate.now());
//        unknown.add("Tanver");        //Error java.lang.UnsupportedOperationException
        process(unknown);

    }
}
