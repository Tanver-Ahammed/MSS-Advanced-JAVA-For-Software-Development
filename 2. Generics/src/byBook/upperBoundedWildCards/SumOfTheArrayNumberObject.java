package byBook.upperBoundedWildCards;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class SumOfTheArrayNumberObject {
    // Upper Bounded wildCards syntax--> <? extends Type>
    // Upper Bounded wildCards we can use fixed types

    public static Double sumProcess(List<? extends Number> list) {
        double sum=0,doubleVal=0;
        for (Number number : list) {
            sum+=number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer>integerList=List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Sum of the Integer Value: "+sumProcess(integerList));

        List<Double>doubleList=List.of(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,11.0);
        System.out.println("Sum of the Double Value: "+sumProcess(doubleList));

        List<? extends Number>mixedNumber = List.of(1.1, BigDecimal.ONE, BigInteger.TEN,.4,5,6.6,7,86f,8,9.988f,11);
        System.out.println("Sum Of the Mixed Value: "+sumProcess(mixedNumber));

    }
}
