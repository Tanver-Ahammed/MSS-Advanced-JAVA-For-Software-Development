public class Counter extends Thread {
    private String objectName;

    public Counter(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.objectName + ": " + i);
        }
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter("Counter 1");
        counter1.start();

        Counter counter2 = new Counter("Counter 2");
        counter2.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Method" + ": " + i);
        }
    }
}
