package com.trungtamjava.connection;

import java.sql.*;

public class SelectPrepareStatement {
    public static void main(String[] args) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "select * from person where id = ? and name = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,2);
            preparedStatement.setString(1,"A");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt("id") + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
