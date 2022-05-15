package bahubrihi.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectionTransaction {
    private Connection connection;
    private PreparedStatement preparedStatement;

    private final String URL = "jdbc:mysql://127.0.0.1/db_with_java?useSSL=false&allowPublicKeyRetrieval=true";
    private final String USER = "root";
    private final String PASSWORD = "147570";

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

    public void placeOrderTransaction(int customerId, int amount) throws SQLException {
        this.connection = this.getConnection();
        this.connection.setAutoCommit(false);
        this.preparedStatement = this.connection.prepareStatement(
                "INSERT INTO orders (Amount, Customer_Id) VALUES (?, ?)");
        this.preparedStatement.setInt(1, amount);
        this.preparedStatement.setInt(2, customerId);

        this.preparedStatement.executeUpdate();

        try {
            this.preparedStatement = this.connection.prepareStatement("UPDATE customer SET " +
                    "Credit = Credit - " + amount + " WHERE Id = ?");
            this.preparedStatement.setInt(1, customerId);
            this.preparedStatement.executeUpdate();
            this.connection.commit();

            System.out.println("Order inserted!!");
        } catch (Exception e) {
            this.connection.rollback();
            e.printStackTrace();
        }

        this.preparedStatement.close();
        this.connection.close();
    }

}
