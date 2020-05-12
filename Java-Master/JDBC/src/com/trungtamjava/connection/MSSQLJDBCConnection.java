package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MSSQLJDBCConnection {
    public static Connection getJDBCConnection(){
        final String user = "user";
        final String password ="password";
        final String url = "jdbc:sqlserver://localhost:1433;databaseName=hello;user="+user+";password="+password;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connection connection = getJDBCConnection();
        if(connection != null){
            System.out.println("ket noi MS SQL JDBC thanh cong");
        }else{
            System.out.println("ket noi MS SQL JDBC chua thanh cong");
        }
    }
}
