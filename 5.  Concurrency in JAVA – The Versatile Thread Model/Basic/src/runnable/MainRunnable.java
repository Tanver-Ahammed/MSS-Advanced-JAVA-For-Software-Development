package runnable;

public class MainRunnable {
    public static void main(String[] args) {

        Counter counter = new Counter("Forward counter ");
        counter.start();

        ReverseCounter reverseCounter = new ReverseCounter("Reverse counter ");
//        Thread rcThread = new Thread(reverseCounter);
//        rcThread.start();

        new Thread(reverseCounter).start();


        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Method " + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
