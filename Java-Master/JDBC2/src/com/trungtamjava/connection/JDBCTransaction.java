package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTransaction {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        Statement statement1 = connection.createStatement();
//        Statement statement2 = connection.createStatement();

        connection.setAutoCommit(false);

        String sql1 = "insert into person2(id,name) values(2,'G')";
        String sql2 = "delete from person2 where id = 3";

        statement1.executeUpdate(sql2);
        statement1.executeUpdate(sql1);

        connection.commit();
    }
}
