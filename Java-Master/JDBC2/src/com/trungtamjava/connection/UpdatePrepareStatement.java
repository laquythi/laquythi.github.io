package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrepareStatement {
    public static void insertRecord(int id,String name) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "insert into person2 (id,name) values(?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,id);
        preparedStatement.setString(1,name);

        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
    }
    
    public static void updateRecord(int id,String name) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "update person2 set name = ? where id = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,id);

        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
    }

    public static void deleteRecord(int id) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "delete from person2 where id = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1,id);

        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
    }

    public static void main(String[] args) throws SQLException {
        insertRecord(1,"d");
        updateRecord(5,"E");
        deleteRecord(1);
    }
}
