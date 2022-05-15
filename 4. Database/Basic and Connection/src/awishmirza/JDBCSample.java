package awishmirza;


import awishmirza.table.Students;

import java.sql.*;
import java.util.Scanner;

public class JDBCSample {



    private static final String SQL = "SELECT* FROM student WHERE FEE <= ?";

    public static void main(String[] args) throws SQLException {
        Double maxFee;

        try {
            maxFee = Double.valueOf(Input.getInt("Enter the Maximum FEE: "));
        } catch (Exception e){
            System.out.println(e);
            return;
        }


        ResultSet resultSet = null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(SQL,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            preparedStatement.setDouble(1,maxFee);

            resultSet = preparedStatement.executeQuery();

            Students.getStudents(resultSet);
        } catch (SQLException sqlException) {
            System.err.println(sqlException);
        } finally {
            if (resultSet != null)
                resultSet.close();
        }


        try (
                Connection connection = DBConnection.getConnection();
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = statement.executeQuery("SELECT* FROM STUDENT");
        ) {

            Students.getStudents(rs);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("If you want to ADD Student: ");

        String ans = scanner.nextLine();
        if (ans.equalsIgnoreCase("yes")) {

            System.out.print("Enter the Stu_ID: ");
            Integer id = scanner.nextInt();

            System.out.print("Enter the First Name: ");
            String fName = scanner.nextLine();
            if (fName.isEmpty())
                fName = scanner.nextLine();

            System.out.print("Enter the Last Name: ");
            String lName = scanner.nextLine();

            System.out.print("Enter the DOB Name: ");
            String dob = scanner.nextLine();

            System.out.print("Enter the EMAIL: ");
            String email = scanner.nextLine();

            System.out.print("Enter the FEE: ");
            Integer fee = scanner.nextInt();

            AddStudent addStudent = new AddStudent();
            addStudent.add(id, fName, lName, dob, email, fee);
        } else {
            System.exit(1);
        }
    }
}












