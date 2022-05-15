import java.util.*;

public class UnmodifiableCollections {

    List<String> list = new LinkedList<>();

    Map<String ,Integer> map = new HashMap<>();

    String []strings =  {"C","C++","C#","JAVA","Kotlin","Python","JS","PHP","Ruby","R"};


    public void readWrite() {

        // write once and then take unmodifiable
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
            map.put(strings[i],i);
        }

        this.list = Collections.unmodifiableList(this.list);
        this.map = Collections.unmodifiableMap(this.map);

        System.out.println("---------------------Print List--------------------");
        for (String element : list) {
            System.out.print(element+" ");
        }
        System.out.println();

        System.out.println("\n---------------------Print Map:--------------------");
        for (String element : map.keySet()) {
            System.out.print(element+" "+map.get(element)+", ");
        }
        System.out.println();
    }

    public void readOnly() {

        // witting mistakenly on collections does not have proper permission
//        this.list.remove(2);        // Not Allow
//        this.map.put("GO",9);       // Not Allow

        System.out.println("\n---------------------Print size:--------------------");

        System.out.println("List contains " + list.size() + " elements.");
        System.out.println("Map contains " + map.size() + " elements.");
    }

    public static void main(String[] args) {
        UnmodifiableCollections un = new UnmodifiableCollections();

        un.readWrite();

        un.readOnly();


    }


}
