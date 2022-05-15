import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainClass {
    public static void main(String[] args) {

        BlockingQueue<FlexiloadInfo> Q = new LinkedBlockingQueue<>();

        int threadNumber = 100;
//        ReentrantLock monitor = new ReentrantLock();


        new FetchFlexiRequests(Q).start();

        for (int i = 0; i < threadNumber; i++) {
            new ExecuteSingleFlexiRequest(Q).start();
        }

    }
}
