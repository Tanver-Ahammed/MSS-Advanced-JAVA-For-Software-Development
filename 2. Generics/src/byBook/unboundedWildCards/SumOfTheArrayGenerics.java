package byBook.unboundedWildCards;

import java.util.List;

public class SumOfTheArrayGenerics {
    // unbounded wildCards has no Type parameter
    // so, we can use Object super type because all
    // types are sub-Type of Object
    public static Double sumProcess(List<?>list) {
        double sum=0,doubleVal=0;
        for (Object object : list) {
            Number number = (Number) object;
            // doubleVal=(Double)number;     //Error java.lang.ClassCastException
            sum+=number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer>integerList=List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Sum of the Integer Value: "+sumProcess(integerList));

        List<Double>doubleList=List.of(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,11.0);
        System.out.println("Sum of the Double Value: "+sumProcess(doubleList));

    }
}
