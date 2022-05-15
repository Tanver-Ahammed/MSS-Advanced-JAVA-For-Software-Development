package interrupt;

public class Counter extends Thread {
    private String objectName;

    public Counter(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.objectName + ": " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+": I am interrupted.");
                System.out.println("Now I can do other things.");
                // interrupt signal comes here when this thread is in sleep
                // we can do anything. We can apply any logic.
            }
        }
    }
}
