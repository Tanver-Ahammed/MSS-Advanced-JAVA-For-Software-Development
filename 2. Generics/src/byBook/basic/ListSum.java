package byBook.basic;

import java.util.List;

public class ListSum {
    public static Number process(List<Number>list) {
        int sum=0;
        for (Number number : list) {
            sum += number.intValue();
        }
        return sum;
    }
}
