public class ReverseCounter extends Thread {
    private String objectName;
    private SleepCounter sleepCounter;

    public ReverseCounter(String objectName, SleepCounter sc) {
        this.objectName = objectName;
        this.sleepCounter = sc;
    }

    @Override
    public void run() {
        for (int i = 10;i >= 1; i--) {
            System.out.println(this.objectName + ": " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 9) {
                try {
                    sleepCounter.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        SleepCounter countSleep1 = new SleepCounter("Forward Count 1");
        countSleep1.start();

        SleepCounter countSleep2 = new SleepCounter("Forward Count 2");
        countSleep2.start();

//        ReverseCounter reverseCounter1 = new ReverseCounter("ReverseCounter 2",);
//        reverseCounter1.start();



        for (int i = 10;i >= 1; i--) {
            System.out.println("Main Method" + ":  " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
