package awishmirza.table;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Students {
    public static void getStudents(ResultSet rs) throws SQLException {

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("¦  ID   ¦        NAME         ¦     DOB      ¦           EMAIL           ¦  FEE  ¦");

        while (rs.next()) {
            String name = String.format("%s %s", rs.getString(2), rs.getString(3));
            System.out.println("¦-------¦---------------------¦--------------¦---------------------------¦-------¦");
            String display = String.format("¦ %5d ¦ %20s ¦ %12s ¦ %25s ¦ %5d ¦", rs.getInt(1), name,
                    rs.getString(4), rs.getString(5), rs.getInt(6));
            System.out.println(display);
        }
        System.out.println("----------------------------------------------------------------------------------");


    }
}
