package byBook.upperBoundedWildCards;

import java.math.BigInteger;
import java.util.List;

public class SumOfTheArrayGenerics {
    public static <T> Double sumProcess(List<? extends T> list) {
        double sum = 0, doubleVal = 0;
        for (T t : list) {
            Number number = (Number) t;
            // doubleVal=(Double)number;     //Error java.lang.ClassCastException
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Sum of the Integer Value: " + sumProcess(integerList));

        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 11.0);
        System.out.println("Sum of the Double Value: " + sumProcess(doubleList));

        List<? extends Number> mixedList = List.of(1,BigInteger.TEN,2.2, 3.3, 4.4, 5.5, 6.6f, 7.7, 8.8, 9.9f, 11.0);
        System.out.println("Sum of the Mixed Value: " + sumProcess(doubleList));


    }
}
