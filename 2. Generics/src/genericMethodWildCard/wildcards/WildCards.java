package genericMethodWildCard.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCards {
    public void genericSubTypes() {
        // String is Sub-Type of a Object or String extends Object
        Object obj = "Hello";    //A supertype reference holding subtype instance
        System.out.println(obj);

        // But ArrayList<String> is not a subType of ArrayList<Object>
//        ArrayList<Object> list = new ArrayList<String>();     //Error , not correct
//        ArrayList<String> list1 = new ArrayList<Object>();
//        List<Object>objectList = new ArrayList<String>();

        List<String> stringList = new ArrayList<>();
//        List<Object>objectList = stringList;    //Error , not correct
    }

    public void usingWildCard() {
        List<Object> objList = new ArrayList<>();
        objList.add("One");
        objList.add("Two");
        objList.add("Three");
        this.printList(objList);

        System.out.println();

        List<String> stringList = new ArrayList<>();
        stringList.add("Four");
        stringList.add("Five");
        stringList.add("Six");
        this.printList(stringList);

        List<Integer>integerList = Arrays.asList(5,10,15,25,25);
        System.out.println("Sum: "+Math.round(this.sum(integerList)));

        List<Integer>integerList1 = Arrays.asList(5,10,15,25,25);
        System.out.println("WildCards of using Lower Bound: "+this.sumUsingLowerBound(integerList1));

        List<Double>doubleList = Arrays.asList(5.5,10.25,15.36,25.96,25.85);
        System.out.println("WildCards of using Lower Bound: "+this.sumUsingUpperBound(doubleList));

        List<Number>numberList = Arrays.asList(5,10,15,25,25);
        System.out.println("WildCards of using of Lower Bound: "+this.sumUsingLowerBound(numberList));


    }

    public void printList(List<? extends Object> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

    public double sum(List<? extends Number> numberList) {
        double sum = 0;
        for (Number number : numberList) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // wildcards upper Bound syntax --> List<? extends Number>
    public double sumUsingUpperBound(List<? extends Number> numberList) {
        double sum = 0;
        for (Number number : numberList) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // wildcards lower Bound syntax --> List<? super Number>
    public double sumUsingLowerBound(List<? super Integer> numberList) {
        int sum = 0;
        for (Object integer : numberList) {
            sum += (int) integer;
        }
        return sum;
    }



}
