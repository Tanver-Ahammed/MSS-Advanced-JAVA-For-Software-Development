package byBook.lowerBoundedWailCards;

import java.util.List;

public class Basic {
    public static void sumAll(List<? super Integer>list) {
        System.out.println(list);
        int sum=0;
        for (Object object : list) {
            Integer integer = (Integer)object;
            sum+= integer;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        List<Integer>integerList = List.of(1,2,3,4,5,6,7,8,9,10);
        integerList.add(12);
        sumAll(integerList);
    }
}
