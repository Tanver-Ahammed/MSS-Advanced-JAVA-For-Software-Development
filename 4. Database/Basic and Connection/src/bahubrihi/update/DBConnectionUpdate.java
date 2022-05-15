package bahubrihi.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectionUpdate {
    private Connection connection;
    private PreparedStatement preparedStatement;

    private static final String URL = "jdbc:mysql://127.0.0.1/db_with_java?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "147570";

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void singleUpdate() throws SQLException {
        System.out.println("Using single update");
        long startTime = System.currentTimeMillis();
        for (int i = 19043; i <= 19058; i++) {
            this.connection = this.getConnection();
            this.preparedStatement = this.connection.prepareStatement(
                    "UPDATE customer SET last_purchase = NOW() WHERE Id = ?");
            this.preparedStatement.setInt(1, i);
            this.preparedStatement.executeUpdate();
            this.preparedStatement.close();
            this.connection.close();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time: " + (endTime-startTime) + " ms");
    }

    public void batchUpdate() throws SQLException {
        System.out.println("Using batch update");
        long startTime = System.currentTimeMillis();
        this.connection = this.getConnection();
        this.preparedStatement = this.connection.prepareStatement(
                "UPDATE customer SET last_purchase = NOW() WHERE Id >= 19043 AND Id <= 19058");
        this.preparedStatement.executeUpdate();
        this.preparedStatement.close();
        this.connection.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time: " + (endTime-startTime) + " ms");
    }
}
