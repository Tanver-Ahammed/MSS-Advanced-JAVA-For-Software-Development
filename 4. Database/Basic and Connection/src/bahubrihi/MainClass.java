package bahubrihi;

import java.sql.SQLException;

public class MainClass {
    public static void main(String[] args) {
        DB_Connection dbApp = new DB_Connection();

        try {
            dbApp.usingCache();
            System.out.println("\n");
            dbApp.usingNoCache();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
