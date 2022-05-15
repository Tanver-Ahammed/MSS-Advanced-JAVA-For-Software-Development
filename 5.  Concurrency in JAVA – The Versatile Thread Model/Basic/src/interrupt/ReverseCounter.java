package interrupt;

public class ReverseCounter extends Thread {
    private String objectName;
    private Counter counter;

    public ReverseCounter(String objectName, Counter counter) {
        this.objectName = objectName;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(this.objectName + ": " + i);

            if (this.isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " I am Interrupted.");
                System.out.println("So, come down off. I will interrupt the counter...");
                this.counter.interrupt();
                break;
            }
        }
    }
}
