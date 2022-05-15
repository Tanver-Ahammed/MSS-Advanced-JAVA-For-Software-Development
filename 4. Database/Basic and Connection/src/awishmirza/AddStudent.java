package awishmirza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStudent {

    public AddStudent() {
    }

    public void add(int id, String fName, String lName, String dob, String email, int fee) {

        String sql = "INSERT INTO STUDENT (ID, FIRST_NAME, LAST_NAME, DOB, EMAIL,FEE) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement stmt = con.prepareStatement(sql)
        ) {

            stmt.setInt(1, id);
            stmt.setString(2, fName);
            stmt.setString(3, lName);
            stmt.setString(4, dob);
            stmt.setString(5, email);
            stmt.setInt(6, fee);

            boolean flag = true;

            try {
                flag = stmt.execute();
            } catch (Exception e) {
                System.out.println(e);
            }

            if (flag) {
                System.out.println("Successfully Added!!");
            } else {
                System.out.println("ERROR DON'T ADDED!!");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
