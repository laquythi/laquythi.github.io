package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatement {
    public static void main(String[] args) {
        try {
            Connection con = JDBCConnection.getJDBCConnection();
            Statement statement = con.createStatement();
            String sql = "select * from demo";

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
