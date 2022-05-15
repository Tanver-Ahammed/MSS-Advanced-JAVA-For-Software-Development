public class MainJoinMethod {
    public static void main(String[] args) {

        SleepCounter sleepCounter = new SleepCounter("Forward Counter");
        sleepCounter.start();

//        try {
//            sleepCounter.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        ReverseCounter reverseCounter = new ReverseCounter("Reverse Counter", sleepCounter);
        reverseCounter.start();

        try {
            reverseCounter.join(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Main Method execution finished!!");
    }
}
