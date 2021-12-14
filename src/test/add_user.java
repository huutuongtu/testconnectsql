package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class add_user {

        public static void adduser(String name, int id) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_jdbc", "root", "Tudeptrai1");
                PreparedStatement st = connection.prepareStatement("INSERT INTO _people(firstname, id) VALUE (\'" + name + "\',\'" + id + "\')");

                st.executeUpdate();
            } catch(Exception deluser) {
                System.out.println(deluser);
            }
        }
        public static void main(String[] args){
            adduser("Tudeptrai", 10);
        }
}


