package jtp;

public class GenericMethod {

    private static <E> void printArray(E[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer []arr = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr);

        String []arr1 = {"Tanver","Talha","Naju"};
        printArray(arr1);

    }
}
