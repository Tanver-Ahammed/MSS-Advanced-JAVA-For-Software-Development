public class MainThread {
    public static void main(String[] args) {

        Thread currentThreadName = Thread.currentThread();

        System.out.println("Current Thread: " + currentThreadName);

        // change current thread name
        currentThreadName.setName("My Thread");
        System.out.println("After name change: " + currentThreadName);

        for (int i = 2*5; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
