package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleJDBCConnection {
    public static Connection getJDBCConnection(){
        final String url = "jdbc:oracle:thin:@localhost:1521:hello";
        final String user = "username";
        final String password = "password";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connection connection2 = getJDBCConnection();
        if(connection2 != null){
            System.out.println("connect to Oracle JDBC successfully");
        }else{
            System.out.println("connect to Oracle failed");
        }
    }
}
