package byBook.lowerBoundedWailCards;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BigIntWildCards {
    public static <T> void processAllSum(List<? super T>list){
        System.out.println(list);
        Double sum=0.0;
        for (Object object : list) {
            Number number = (Number) object;
            sum+=number.doubleValue();
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        List<? super BigDecimal> bigDecimalList = new ArrayList<>();
        bigDecimalList.add(BigDecimal.ONE);
        bigDecimalList.add(BigDecimal.TEN);
        bigDecimalList.add(BigDecimal.valueOf(12345));
        processAllSum(bigDecimalList);

        List<? super BigInteger> bigIntegerList = new ArrayList<>();
        bigIntegerList.add(BigInteger.ONE);
        bigIntegerList.add(BigInteger.TWO);
        bigIntegerList.add(BigInteger.TEN);
        bigIntegerList.add(BigInteger.valueOf(12345));
        bigIntegerList.add(BigInteger.valueOf(10000));
        processAllSum(bigIntegerList);

    }
}
