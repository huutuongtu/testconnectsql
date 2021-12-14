package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class show_all_info_users {
    public static void main(String[] args) {
        int i=0;
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_jdbc", "root", "Tudeptrai1"); //connection
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("select * from _people"); // Chọn database

            while (resultSet.next()) {
                i++;

                    System.out.println("Thông tin của user " + i +":");
                    System.out.println("Tên user: " + resultSet.getString("firstname"));
                    System.out.println("id: " + resultSet.getString("id"));

            }

        } catch (Exception finduser) {
            finduser.printStackTrace();
        }


    }
}
