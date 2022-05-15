package codingTask2;

public final class SwapAlgorithm {
    public static <T> void swap(T[] array, int i, int j) {
//        T[]arr = new T[10];  //not allow
        System.out.println(array[i]+" "+ array[j]);
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        System.out.println(array[i]+" "+ array[j]);
    }

    public static void main(String[] args) {
        Integer[]array = new Integer[10];
        array[0]=10;
        array[1]=20;
        swap(array,0,1);
    }
}
