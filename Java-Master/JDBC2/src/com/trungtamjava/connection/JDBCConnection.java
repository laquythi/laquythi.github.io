package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getJDBCConnection(){
        final String url = "jdbc:mysql://localhost:3306/hello2";
        final String user = "root";
        final String password = "123456";
        try {
            Class.forName("com.mysql.jdbc.Driver");

        return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connection connection = getJDBCConnection();
        if(connection != null){
            System.out.println("ket noi thanh cong");
        }else{
            System.out.println("ket noi ko thanh cong");
        }
    }
}
