import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class InsertFlexiRequest extends Thread {
    private Connection connection;
    private PreparedStatement preparedStatement;

    @Override
    public void run() {
        this.connection = DBConnection.getConnection();
        try {
            for (int i = 0; i < 50000; i++) {
                this.preparedStatement = this.connection.prepareStatement(
                        "INSERT INTO flexiload_requests (Sender, Receiver, Amount) VALUES (?, ?, ?)");

                String sender,receiver;
                Random random = new Random();
                int sendTemp = random.nextInt(123456789);
                int receiveTemp = random.nextInt(123456789);

                sender = "01" + (sendTemp/7*3*3);
                receiver = "01" + (receiveTemp/7*3*3);

                preparedStatement.setString(1,sender);
                preparedStatement.setString(2,receiver);
                preparedStatement.setString(3, String.valueOf((random.nextInt(125) + 12) / 3 * 5));
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
