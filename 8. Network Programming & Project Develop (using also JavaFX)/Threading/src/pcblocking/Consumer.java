package pcblocking;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    BlockingQueue<String> q;
    Thread thread;
    String name;

    public Consumer(BlockingQueue<String> q, String name) {
        this.q = q;
        this.name = name;
        this.thread = new Thread(this, this.name);
        this.thread.start();
    }

    @Override
    public void run() {
        System.out.println(this.name + " started ...");
        while (true) {
            try {
                if (this.q.size() == 0) {
                    System.out.println(this.name + " Queue is Empty ...");
                    Thread.sleep(2000);
                }
                System.out.println(this.name + " got " + this.q.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
