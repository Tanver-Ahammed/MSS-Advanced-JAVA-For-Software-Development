package bahubrihi.update;

import java.sql.SQLException;

public class MainUpdate {
    public static void main(String[] args) {

        DBConnectionUpdate dbUpdate = new DBConnectionUpdate();

        try {
            dbUpdate.singleUpdate();

            System.out.println();

            dbUpdate.batchUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
