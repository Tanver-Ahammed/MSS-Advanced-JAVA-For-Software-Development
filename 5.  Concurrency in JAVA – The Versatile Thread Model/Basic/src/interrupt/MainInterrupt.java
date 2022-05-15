package interrupt;

public class MainInterrupt {
    public static void main(String[] args) {

        Counter counter = new Counter("Forward Counter ");
        counter.start();

        try {
            counter.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        ReverseCounter reverseCounter = new ReverseCounter("Reverse Counter",counter);
        reverseCounter.start();

//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        reverseCounter.interrupt();
    }
}
