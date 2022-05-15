class NewThread implements Runnable {

    int threadNumber;
    Thread thread;

    public NewThread(int threadNumber) {
        this.thread = new Thread(this, "Runnable Thread");
        this.threadNumber = threadNumber;
        this.thread.start();
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.threadNumber + "-Child Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Child Thread Interrupt.");
            }
        }
        System.out.println("Exiting child Thread");
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        System.out.println("Main Thread started.....");

        NewThread obj1 = new NewThread(1);

        try {
            obj1.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        NewThread obj2 = new NewThread(2);

        System.out.println("Thread-1 is alive?: " + obj1.thread.isAlive());
        System.out.println("Thread-2 is alive?: " + obj2.thread.isAlive());


        System.out.println("Main Thread exited .....");

    }
}
