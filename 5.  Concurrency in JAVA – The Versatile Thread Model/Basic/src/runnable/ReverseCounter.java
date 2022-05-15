package runnable;

public class ReverseCounter extends BaseClass implements Runnable {
    private String objectName;

    public ReverseCounter(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public void run() {
        this.baseClassMethod();
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.objectName + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
