package list.consumingtime;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListInterface {

    long startTimeArrayList, endTimeArrayList, startTimeLinkedList, endTimeLinkedList;

    public void findInsertComparison() {
        Random random = new Random();

        List<Integer> intArrayList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();

        int i;
        for (i = 0; i < 50000; i++) {
            int temp = random.nextInt(1000000);
            intArrayList.add(temp);
            intLinkedList.add(temp);
        }

//-------------------------------------------------------------------------------
        // insert element experiment
        System.out.println("**************** insert element experiment ***************");
        // insert first
        System.out.println("insert first");
        for (int j = 0; j < 10; j++) {
            int temp = random.nextInt(1000000);

            startTimeArrayList = System.nanoTime();
            intArrayList.add(0, temp);
            endTimeArrayList = System.nanoTime();
            System.out.printf("%5d \t", (endTimeArrayList - startTimeArrayList));


            startTimeLinkedList = System.nanoTime();
            intLinkedList.add(0, temp);
            endTimeLinkedList = System.nanoTime();
            System.out.println(endTimeLinkedList - startTimeLinkedList);
        }

        // insert middle
        System.out.println("\ninsert middle");
        for (int j = 0; j < 10; j++) {
            int temp = random.nextInt(1000000);

            startTimeArrayList = System.nanoTime();
            intArrayList.add(25000, temp);
            endTimeArrayList = System.nanoTime();
            System.out.printf("%5d \t", (endTimeArrayList - startTimeArrayList));


            startTimeLinkedList = System.nanoTime();
            intLinkedList.add(25000, temp);
            endTimeLinkedList = System.nanoTime();
            System.out.println(endTimeLinkedList - startTimeLinkedList);
        }

        // insert last
        System.out.println("\ninsert last");
        for (int j = 0; j < 10; j++) {
            int temp = random.nextInt(1000000);

            startTimeArrayList = System.nanoTime();
            intArrayList.add(temp);
            endTimeArrayList = System.nanoTime();
            System.out.printf("%5d \t", (endTimeArrayList - startTimeArrayList));


            startTimeLinkedList = System.nanoTime();
            intLinkedList.add(temp);
            endTimeLinkedList = System.nanoTime();
            System.out.println(endTimeLinkedList - startTimeLinkedList);
        }
        System.out.println("******************************************************");
    }

    //-------------------------------------------------------------------------------

    public void findRemoveComparison() {
        Random random = new Random();

        List<Integer> intArrayList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();

        int i = 0;
        for (i = 0; i < 50000; i++) {
            int temp = random.nextInt(1000000);
            intArrayList.add(temp);
            intLinkedList.add(temp);
        }

        // remove element experiment
        System.out.println("************* remove element experiment ***************");
        // remove first
        System.out.println("remove first");
        int index = 0;
        for (int j = 0; j < 10; j++) {
            startTimeArrayList = System.nanoTime();
            intArrayList.remove(index);
            endTimeArrayList = System.nanoTime();
            System.out.printf("%5d \t", (endTimeArrayList - startTimeArrayList));


            startTimeLinkedList = System.nanoTime();
            intLinkedList.remove(index);
            endTimeLinkedList = System.nanoTime();
            System.out.println(endTimeLinkedList - startTimeLinkedList);
        }

        // remove middle
        index = 25000;
        System.out.println("\nremove middle");
        for (int j = 0; j < 10; j++) {

            startTimeArrayList = System.nanoTime();
            intArrayList.remove(index);
            endTimeArrayList = System.nanoTime();
            System.out.printf("%5d \t", (endTimeArrayList - startTimeArrayList));


            startTimeLinkedList = System.nanoTime();
            intLinkedList.remove(index);
            endTimeLinkedList = System.nanoTime();
            System.out.println(endTimeLinkedList - startTimeLinkedList);
        }

        // remove last
        System.out.println("\nremove last");
        index = 50000-30;
        for (int j = 0; j < 10; j++) {

            startTimeArrayList = System.nanoTime();
            intArrayList.remove(index);
            endTimeArrayList = System.nanoTime();
            System.out.printf("%5d \t", (endTimeArrayList - startTimeArrayList));


            startTimeLinkedList = System.nanoTime();
            intLinkedList.remove(index);
            endTimeLinkedList = System.nanoTime();
            System.out.println(endTimeLinkedList - startTimeLinkedList);
        }
        System.out.println("******************************************************");
    }

    public void findGetComparison() {
        Random random = new Random();

        List<Integer> intArrayList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();

        for (int i = 0; i < 50000; i++) {
            int temp = random.nextInt(1000000);
            intArrayList.add(temp);
            intLinkedList.add(temp);
        }

        // get element experiment
        System.out.println("************* get element experiment ***************");
        // get first
        System.out.println("get first");
        int index = 0;
        for (int j = 0; j < 10; j++) {
            startTimeArrayList = System.nanoTime();
            intArrayList.get(index);
            endTimeArrayList = System.nanoTime();
            System.out.printf("%5d \t", (endTimeArrayList - startTimeArrayList));


            startTimeLinkedList = System.nanoTime();
            intLinkedList.get(index);
            endTimeLinkedList = System.nanoTime();
            System.out.println(endTimeLinkedList - startTimeLinkedList);
        }

        // get middle
        index = 25000;
        System.out.println("\nget middle");
        for (int j = 0; j < 10; j++) {

            startTimeArrayList = System.nanoTime();
            intArrayList.get(index);
            endTimeArrayList = System.nanoTime();
            System.out.printf("%5d \t", (endTimeArrayList - startTimeArrayList));


            startTimeLinkedList = System.nanoTime();
            intLinkedList.get(index);
            endTimeLinkedList = System.nanoTime();
            System.out.println(endTimeLinkedList - startTimeLinkedList);
        }

        // get last
        System.out.println("\nget last");
        index = 50000-1;
        for (int j = 0; j < 10; j++) {

            startTimeArrayList = System.nanoTime();
            intArrayList.get(index);
            endTimeArrayList = System.nanoTime();
            System.out.printf("%5d \t", (endTimeArrayList - startTimeArrayList));


            startTimeLinkedList = System.nanoTime();
            intLinkedList.get(index);
            endTimeLinkedList = System.nanoTime();
            System.out.println(endTimeLinkedList - startTimeLinkedList);
        }
        System.out.println("******************************************************");





    }
}















