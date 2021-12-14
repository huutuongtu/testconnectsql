package test;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;



public class findoneuser{


    public static void findoneuser(String name) {
        int flag=0;

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_jdbc", "root", "Tudeptrai1"); //connection
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("select * from _people"); // Chọn database

            while (resultSet.next()) {
                if (resultSet.getString("firstname").equals(name)) {

                    System.out.println("Thông tin của user: ");
                    System.out.println("Tên user: " + resultSet.getString("firstname"));
                    System.out.println("id: " + resultSet.getString("id"));
                    flag = 0;
                    break;
                }
                else{flag=1;}
            }
            if (flag==1){
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "User not found!!!");
            }

        } catch (Exception findoneuser) {
            findoneuser.printStackTrace();
        }


    }

    public static void main(String[] args){
        findoneuser("user1");
    }
        }



