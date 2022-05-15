package staticFinal;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------static--------------------");
        System.out.println(StaticClass.number);
        StaticClass staticClass = new StaticClass();
        StaticClass.number += 10;
        StaticClass.number += 10;

        System.out.println(StaticClass.number);

        System.out.println(StaticClass.number);

        staticClass.normalMethod();
        StaticClass.staticMethod();

        System.out.println(StaticClass.number);


        System.out.println();

        System.out.println("-----------------final--------------------");

        FinalClass finalObj = new FinalClass("This final keyword!!");
        System.out.println(finalObj.fixed);
        System.out.println(finalObj.fixedName);
        System.out.println(finalObj.fixedInstitution);

    }
}
