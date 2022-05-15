package byBook.basic;

import java.math.BigInteger;

public class Holder2<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public Holder2 setObject(T object) {
        this.object = object;
        return this;
    }

    public static void main(String[] args) {
        Holder2<String> stringHolder2 = new Holder2<>();
        stringHolder2.setObject("Hello World!!");
        String st = stringHolder2.getObject();
        System.out.println(st);

        Holder2<Integer> integerHolder2 = new Holder2<>();
        integerHolder2.setObject(4);

        Integer integer = integerHolder2.getObject();
        Integer sum=0;
        sum = integer+5;
        System.out.println(sum);


        Holder2<Number> numberHolder2 = new Holder2<>();
        numberHolder2.setObject(BigInteger.ONE);
        System.out.println(numberHolder2.getObject());

        numberHolder2.setObject(5);
        System.out.println(numberHolder2.getObject());

        Holder2<Holder2<Number>> holder2Holder2 = new Holder2<>();
//        holder2Holder2.setObject(integerHolder2);  Here does not possible




    }
}