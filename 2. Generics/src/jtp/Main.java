package jtp;

public class Main {
    public static void main(String[] args) {

        MyGeneric<Integer>genericInt = new MyGeneric<>();
        genericInt.add(12);
        System.out.println(genericInt.get());

        MyGeneric<String>genericStr = new MyGeneric<>();
        genericStr.add("Tanver");
        System.out.println(genericStr.get());

        MyGeneric<Float>genericFlo = new MyGeneric<>();
        genericFlo.add(12.255f);
        System.out.println(genericFlo.get());

        MyGeneric<Double>genericDou = new MyGeneric<>();
        genericDou.add(12.54554);
        System.out.println(genericDou.get());




    }
}
