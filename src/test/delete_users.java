package test;

import java.sql.*;

public class delete_users {
    public static void deleteuser(String name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_jdbc", "root", "Tudeptrai1");
            PreparedStatement st = connection.prepareStatement("DELETE FROM _people WHERE firstname = ?");
            st.setString(1,name);
            st.executeUpdate();
        } catch(Exception deluser) {
            System.out.println(deluser);
        }
    }

    public static void main(String[] args){
        deleteuser("Tudeptrai");
    }


}

