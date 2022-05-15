package usingBuiltInGenericsClass;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String >strList = new ArrayList<String>();
        strList.add(0,"New Car");
        System.out.println(strList.get(0).startsWith("New"));

        ArrayList<Car>carList = new ArrayList<>();
        carList.add(0,new Car());
        System.out.println(carList.get(0).getColor());

        carList.get(0).setColor("Yellow");
        System.out.println(carList.get(0).getColor());

        ArrayList list = new ArrayList();
        list.add(0,"New Car");
        list.add(1,new Car());

        // Type Casting of the code
        String st = (String) list.get(0);
        System.out.println(st.startsWith("New"));

        Car c = (Car) list.get(1);
        c.setColor("Red");
        System.out.println(c.getColor());

        HashMap<String ,Integer> map = new HashMap<String ,Integer>();
        HashMap<String ,ArrayList<Integer>>mapList = new HashMap<String, ArrayList<Integer>>();

    }
}
