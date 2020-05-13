package com.trungtamjava.connection;

import java.sql.*;

public class SelectPrepareStatement {
    public static void main(String[] args) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "select * from person where id = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            preparedStatement.setInt(2,2);

            while (rs.next()){
                System.out.println(rs.getInt("id") + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
