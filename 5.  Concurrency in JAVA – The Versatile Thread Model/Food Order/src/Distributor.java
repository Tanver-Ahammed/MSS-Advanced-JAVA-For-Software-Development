import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Distributor extends Thread {
    LinkedBlockingQueue<FoodOrder> ordersQueue;
    ReentrantLock monitor;

    public Distributor(ReentrantLock monitor, int id, LinkedBlockingQueue<FoodOrder> ordersQueue) {
        this.ordersQueue = ordersQueue;
        this.setName("Distributor " + id);
        this.monitor = monitor;
    }

    @Override
    public void run() {
        int c = 0;
        while (true) {
            if (c > 0) {
                System.out.println("Distributor Loop running after getting Notified.");
            }
            if (ordersQueue.isEmpty()) {
                System.out.println(this.getName() + " finds Q Empty!!");
            }

            try {
                FoodOrder currentOrder = ordersQueue.take();
                if (currentOrder.getStatus().equals("COOKED")) {
                    this.findDeliveryMan(currentOrder);
                    System.out.println(this.getName() + ": Cooking Finished");
                } else {
                    ordersQueue.put(currentOrder);
                    System.out.println(this.getName() + ": Not Finished. Putting back to Queue.");
                    synchronized (monitor) {
                        monitor.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void findDeliveryMan(FoodOrder currentOrder) {
        System.out.println(this.getName() + ": order " + currentOrder.getId() + "is on the way.");
    }
}
