package byBook.basic;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        List<String> list1 = List.of("Tanver", "Naju", "Talha");

        System.out.println(list);
        System.out.println(list1);

        Object someObject = new Object();
        Integer someInteger = 25;
        someObject=someInteger;
        System.out.println(someObject);

    }
}
