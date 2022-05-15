public class SleepCounter extends Thread {
    private String objectName;

    public SleepCounter(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.objectName + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            SleepCounter forwardCounter = new SleepCounter("Forward Counter " + i);
            forwardCounter.start();
        }

        for (int i = 1; i <= 30; i++) {
//            ReverseCounter reverseCounter = new ReverseCounter("Reverse Counter " + i, );
//            reverseCounter.start();
        }



        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Method" + ":  " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
