package runnable;

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
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
