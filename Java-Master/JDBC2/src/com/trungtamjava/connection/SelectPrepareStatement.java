package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPrepareStatement {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "select * from person2 where id = ? and name = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,2);
        preparedStatement.setString(2,"c");
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()){
            System.out.println(rs.getInt("id") + rs.getString("name"));
        }
    }
}
