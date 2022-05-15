import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class OrderProcessor extends Thread {
    Random random = new Random();
    LinkedBlockingQueue<FoodOrder> ordersQueue;
    ReentrantLock monitor;

    public OrderProcessor(ReentrantLock monitor, LinkedBlockingQueue<FoodOrder> ordersQueue) {
        this.ordersQueue = ordersQueue;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        for ( ; ; ) {
            int delayTime = random.nextInt(500) + 1000;
            try {
                Thread.sleep(delayTime);
                this.changeStatus();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void changeStatus() throws InterruptedException {
        FoodOrder order = ordersQueue.take();

        switch (order.getStatus()) {
            case "ARRIVED" :
                order.setStatus("PROCESSING");
                System.out.println("Order " + order.getId() + " is Processing....");
                break;

            case "PROCESSING" :
                order.setStatus("COOKING");
                System.out.println("Order " + order.getId() + " is Cooking....");
                break;

            case "COOKING" :
                order.setStatus("COOKED");
                System.out.println("Order " + order.getId() + " is Cooked.");
                break;
        }

        ordersQueue.put(order);

        if (order.getStatus().equals("COOKED")) {
            System.out.println("processor notifying Distributor");

            synchronized (monitor) {
                monitor.notifyAll();
            }

        }

    }
}
