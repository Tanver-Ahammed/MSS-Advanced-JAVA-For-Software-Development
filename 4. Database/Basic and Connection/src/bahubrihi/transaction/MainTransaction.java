package bahubrihi.transaction;

import java.sql.SQLException;

public class MainTransaction {
    public static void main(String[] args) {

        DBConnectionTransaction dbApp = new DBConnectionTransaction();
        try {
            dbApp.placeOrderTransaction(19043, 123);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

