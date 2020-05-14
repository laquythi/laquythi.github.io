package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatement {
    public static <Resultset> void main(String[] args) {
        Connection connection = JDBCConnection.getJDBCConnection();

        try {
            Statement statement = connection.createStatement();
            final String sql = "select * from person2 where id = 2";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
