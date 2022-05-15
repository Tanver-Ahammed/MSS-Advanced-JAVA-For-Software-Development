package list.basic;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        List<String> stringArrayList = new ArrayList<>();     // ArrayList Created
        List<String> stringLinkedList = new LinkedList<>();   // ArrayList Created

        String []stArr = {"Java","python","C","C++","PHP","Kotlin","R"};

        System.out.println(Arrays.toString(stArr));

        // convert Array to List
        for (String element : stArr) {
            stringArrayList.add(element);
            stringLinkedList.add(element);
        }


        System.out.println(stringArrayList);

        for (String element : stringArrayList) {
            System.out.println(element);
        }

        for (String element : stringLinkedList) {
            System.out.println(element);
        }


        stringArrayList.add("C#");
        stringLinkedList.add("C#");

        stringArrayList.add("HTML");
        stringLinkedList.add("HTML");


        // convert List to Array

        String []alArray = stringArrayList.toArray(new String[stringArrayList.size()]);
        String []llArray = stringLinkedList.toArray(new String[stringLinkedList.size()]);
        System.out.println();
        for (int i = 0; i < alArray.length; i++) {
            System.out.println(alArray[i]+"\t"+llArray[i]);
        }

        // set element
        stringArrayList.set(6,"Ruby");
        stringLinkedList.set(6,"Ruby");

        stringArrayList.set(1,"JS");
        stringLinkedList.set(1,"JS");
        System.out.println();
        System.out.println(stringArrayList);
        System.out.println(stringLinkedList);

        // sort the List
        System.out.println();
        Collections.sort(stringArrayList);
        Collections.sort(stringLinkedList);

        System.out.println(stringArrayList);
        System.out.println(stringLinkedList);

        // Iterator
        Iterator<String> iteratorAL = stringArrayList.iterator();
        Iterator<String> iteratorLL = stringLinkedList.iterator();
        System.out.println();
        while (iteratorAL.hasNext()) {
            System.out.println(iteratorAL.next()+"\t"+iteratorLL.next());
        }

        // ListIterator
        ListIterator<String> listIteratorAL = stringArrayList.listIterator();
        ListIterator<String> listIteratorLL = stringLinkedList.listIterator();

        while (listIteratorAL.hasPrevious()) {
            System.out.println(listIteratorAL.previous()+"\t"+listIteratorLL.previous());
        }
    }
}
