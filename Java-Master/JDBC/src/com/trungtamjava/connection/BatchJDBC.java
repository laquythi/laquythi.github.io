package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchJDBC {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql1 = "insert into person (id,name) values(1,'A')";
        String sql2 = "insert into person (id,name) values(2,'A')";
        String sql3 = "insert into person (id,name) values(3,'A')";

        Statement statement = connection.createStatement();

        statement.addBatch(sql1);
        statement.addBatch(sql2);
        statement.addBatch(sql3);


        String sql4 = "insert into person (id,name) values (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql4);

        preparedStatement.setInt(1,4);
        preparedStatement.setString(2,"B");
        preparedStatement.addBatch();

        preparedStatement.setInt(1,5);
        preparedStatement.setString(2,"C");
        preparedStatement.addBatch();statement.executeBatch();
    }
}
