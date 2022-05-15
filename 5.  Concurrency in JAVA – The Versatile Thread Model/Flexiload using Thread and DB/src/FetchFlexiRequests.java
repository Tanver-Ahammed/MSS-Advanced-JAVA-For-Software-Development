import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class FetchFlexiRequests extends Thread {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private int fetchSize = 5000;
    private int processingBatchSize = 500;
//    Queue<FlexiloadInfo> Q;

    BlockingQueue<FlexiloadInfo> Q;

//    ReentrantLock lock;

//    Object monitor;

    public FetchFlexiRequests(BlockingQueue<FlexiloadInfo> Q) {
        this.Q = Q;
//        this.lock = lock;
//        this.monitor = monitor;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.pickFromDB();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void pickFromDB() throws SQLException {
        System.out.println("Operation start");
        this.connection = DBConnection.getConnection();
        this.preparedStatement = this.connection.prepareStatement("SELECT* FROM flexiload_requests " +
                " WHERE `Status` = 'New'");
        this.preparedStatement.setFetchSize(this.fetchSize);
        this.resultSet = this.preparedStatement.executeQuery();

        List<Integer> idList = new ArrayList<>();
        List<FlexiloadInfo> flexiBatch = new ArrayList<>();

        while (this.resultSet.next()) {
            FlexiloadInfo flexiloadInfo = new FlexiloadInfo();

            flexiloadInfo.setId(resultSet.getInt("id"));
            flexiloadInfo.setSender(resultSet.getString("Sender"));
            flexiloadInfo.setReceiver(resultSet.getString("Receiver"));
            flexiloadInfo.setAmount(resultSet.getInt("Amount"));

            idList.add(flexiloadInfo.getId());
            flexiBatch.add(flexiloadInfo);

            if (idList.size() == this.processingBatchSize) {
                this.makeStatusProcessing(idList);

                // using ReentrantLock
//                lock.lock();
//                Q.addAll(flexiBatch);
//                lock.unlock();

//                synchronized (monitor) {
//                    Q.addAll(flexiBatch);
//                }

                Q.addAll(flexiBatch);



                idList.clear();
                flexiBatch.clear();
            }
        }
        this.resultSet.close();
        this.preparedStatement.close();
        this.connection.close();
    }

    private void makeStatusProcessing(List<Integer> idList) {

        String sqlIds = idList.toString();

        sqlIds = sqlIds.replace('[','(');
        sqlIds = sqlIds.replace(']',')');

        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE flexiload_requests " +
                    "SET `Status` = ?, updated_at = Now() WHERE id IN " + sqlIds);
            preparedStatement.setString(1, "Processing");
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
