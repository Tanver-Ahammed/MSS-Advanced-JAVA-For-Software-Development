package wrapperVsPrimitive;

public class Main {
    public static void main(String[] args) {
        // primitive Datatype --> boolean , byte , char , short , int , float , long , double
        // wrapper Datatype --> Boolean , Byte , Character , Short , Integer , Float , Long , Double

        //autoboxing --> primitive to wrapper
        //unboxing --> wrapper to primitive

        char charVariable = 'A';
        Character anotherCharVariable  = 'z';

        charVariable = anotherCharVariable;

        anotherCharVariable = charVariable;

        int intVariable = 50;
        Integer anotherIntVariable = intVariable;

        double doubleVariable = 40.65;
        Double anotherDoubleVariable = doubleVariable;

        System.out.println(charVariable);
        System.out.println(anotherCharVariable);

        System.out.println(intVariable);
        System.out.println(anotherIntVariable);

        System.out.println(doubleVariable);
        System.out.println(anotherDoubleVariable);
    }
}
