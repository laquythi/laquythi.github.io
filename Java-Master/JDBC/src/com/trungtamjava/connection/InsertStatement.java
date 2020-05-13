package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {
    public static void insertRecord(int id, String name) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "insert into person(id,name) values(1,'a')";
            int rs = statement.executeUpdate(sql);
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void updateRecord(int id, String newName){
        Connection connection = JDBCConnection.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "update person set name = '" + newName + "' where id = " + id;
            int rs = statement.executeUpdate(sql);
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteRecord(int id){
        Connection connection = JDBCConnection.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "delete from person where id = " + id;
            int rs = statement.executeUpdate(sql);
            System.out.println(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
//        insertRecord(1,"a");
//          updateRecord(1,"b");
        deleteRecord(1);
    }
}
