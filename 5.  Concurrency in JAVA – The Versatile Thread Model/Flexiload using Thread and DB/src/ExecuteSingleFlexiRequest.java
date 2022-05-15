import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ExecuteSingleFlexiRequest extends Thread {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private int fetchSize = 5000;
    private int processingBatchSize = 500;

//    Queue<FlexiloadInfo> Q;

    BlockingQueue<FlexiloadInfo> Q;

//    ReentrantLock lock;

//    Object monitor;

    public ExecuteSingleFlexiRequest (BlockingQueue<FlexiloadInfo> Q) {
        this.Q = Q;
//        this.lock = lock;
//        this.monitor = monitor;
    }

    @Override
    public void run() {
        while (true) {
            if (Q.isEmpty()) {
                try {
                    Thread.sleep(100);
                    continue;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

//            lock.lock();
//            FlexiloadInfo flexiloadInfo = Q.poll();
//            lock.unlock();

//            FlexiloadInfo flexiloadInfo;
//            synchronized (monitor) {
//                flexiloadInfo = Q.poll();
//            }

            FlexiloadInfo flexiloadInfo = Q.poll();

            if (flexiloadInfo != null) {
                this.singleFlexiTransaction(flexiloadInfo);
            }
        }
    }

    public void singleFlexiTransaction(FlexiloadInfo flexiloadInfo) {
        String flexiStatus = this.sendAmountTransaction(flexiloadInfo);

        flexiloadInfo.setStatus(flexiStatus);
        this.updateStatus(flexiloadInfo);
    }

    public String sendAmountTransaction(FlexiloadInfo flexiloadInfo) {
        // just apply some delay for transaction

        try {
            Thread.sleep(new Random().nextInt(100) + 50);
            return "Success";
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "Fail";
        }
    }

    public boolean updateStatus(FlexiloadInfo flexiloadInfo) {
        System.out.println(flexiloadInfo.getId()+" - "+flexiloadInfo.getStatus());
        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE flexiload_requests " +
                    "SET `Status` = ? , updated_at = Now() WHERE id = ?");
            preparedStatement.setString(1,flexiloadInfo.getStatus());
            preparedStatement.setInt(2,flexiloadInfo.getId());
            preparedStatement.executeUpdate();
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
