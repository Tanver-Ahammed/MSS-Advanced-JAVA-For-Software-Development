package genericMethodWildCard.basic;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        //---------------------------------------------------------------------------
        //Now we are using Actual Type parameter

        MainClass app = new MainClass();

        String stringElement = "Md. Tanver Ahammed.";
        List<String> stringList = new ArrayList<String>();
        app.addStringToList(stringElement, stringList);
        System.out.println(stringList);

        Integer integerElement = 123;
        List<Integer> integerList = new ArrayList<Integer>();
        app.addIntToList(integerElement, integerList);
        System.out.println(integerList);

        MyClass myClass = new MyClass();
        List<MyClass> myClassList = new ArrayList<MyClass>();
        app.addMyClassToList(myClass, myClassList);
        System.out.println(myClassList);

        //---------------------------------------------------------------------------
        //Now we are using Generic Type parameter

        String stringElement1 = "Md. Tanver Ahammed.";
        List<String> stringList1 = new ArrayList<>();
        app.<String>addElementToList(stringElement1, stringList1);
        app.<String>addElementToList("stringElement1", stringList1);
        System.out.println(stringList1);

        Integer integerElement1 = 123;
        List<Integer> integerList1 = new ArrayList<>();
        app.<Integer>addElementToList(integerElement1, integerList1);
        app.<Integer>addElementToList(456, integerList1);
        app.<Integer>addElementToList(789, integerList1);
        System.out.println(integerList1);

        MyClass myClass1 = new MyClass();
        List<MyClass> myClassList1 = new ArrayList<>();
        app.<MyClass>addElementToList(myClass1, myClassList1);
        System.out.println(myClassList1);

        //---------------------------------------------------------------------------
        //Now we are using Object Type vs String Type Parameters

        String stringElement2 = "Aminul Bari";
        List<Object>objectList = new ArrayList<>();
        app.<Object>addElementToList(stringElement2,objectList);
        System.out.println(objectList);

/*        * Here String extends Object but not of Object extends String
        * it not possible all Strings are Object but all Objects are not String

        Object objectElement = new Object();
        List<String>stringList2 = new ArrayList<>();
        app.addElementToList(objectElement,stringList2);

        * so it is not possible
        * */
    }

    //----------------non-Generic Method---------------------------
    public void addIntToList(int element, List<Integer> integerList) {
        integerList.add(element);
    }

    public void addStringToList(String element, List<String> stringList) {
        stringList.add(element);
    }

    public void addMyClassToList(MyClass element, List<MyClass> myClassList) {
        myClassList.add(element);
    }

    //------------------Generic Method--------------------------------
    public <T extends Object> void addElementToList(T element, List<T> list) {
        list.add(element);
    }
}
