package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {
    public static void insertRecord(int id,String name) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        Statement statement = connection.createStatement();

        String sql = "insert into person2(id,name) values(5,'e') ";
        int rs =  statement.executeUpdate(sql);

        System.out.println(rs);
    }
    public static void updateRecord(int id,String name) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        Statement statement = connection.createStatement();

        String newName = "C";
        String sql = "update person2 set name = '"+ newName +"' where id = " + id;
        int rs =  statement.executeUpdate(sql);

        System.out.println(rs);
    }
    public static void deleteRecord(int id) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        Statement statement = connection.createStatement();

        String sql = "delete from person2 where id = " + id;
        int rs =  statement.executeUpdate(sql);

        System.out.println(rs);
    }

    public static void main(String[] args) throws SQLException {
//        insertRecord(5,"e");
//          updateRecord(3,"C");
            deleteRecord(4);
    }
}
