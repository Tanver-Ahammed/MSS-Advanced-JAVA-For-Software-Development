package pcblocking;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    BlockingQueue<String> q;
    Thread thread;
    String name;

    public Producer(BlockingQueue<String>q, String name) {
        this.q = q;
        this.name = name;
        this.thread = new Thread(this, this.name);
        this.thread.start();
    }

    @Override
    public void run() {
        System.out.println(this.name + " started ...");
        int i = 1;
        while (true) {
            try {
                if (this.q.size() >= 4) {
                    System.out.println(this.name + ": Queue is full ...");
                    Thread.sleep(2000);
                    i = 1;
                }

                q.put("Cake-" + i);
                System.out.println(this.name + "- created cake no: " + i);
                Thread.sleep(300);
                ++i;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
