package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrepareStatement {
    public static void insertRecord(int id,String name){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "insert into person (id,name) values(?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateRecord(int id,String name){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "update person set name = ? where id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteRecord(int id){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "delete from person where id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        insertRecord(5,"e");
        updateRecord(3,"A");
        deleteRecord(1);
    }
}
