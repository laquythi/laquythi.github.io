package com.trungtamjava.connection;

import jdk.nashorn.internal.scripts.JD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchJDBC {

    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();
        Statement statement = connection.createStatement();

        String sql1 = "insert into person2(id,name) values(1,'z')";
        String sql2 = "insert into person2(id,name) values(2,'z')";
        String sql3 = "insert into person2(id,name) values(3,'z')";

//        statement.addBatch(sql1);
//        statement.addBatch(sql2);
//        statement.addBatch(sql3);

        String sql4 = "insert into person2(id,name) values(?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql4);

        preparedStatement.setInt(1,4);
        preparedStatement.setString(2,"B");
        preparedStatement.addBatch();

        preparedStatement.setInt(1,5);
        preparedStatement.setString(2,"B");
        preparedStatement.addBatch();

        preparedStatement.setInt(1,6);
        preparedStatement.setString(2,"B");
        preparedStatement.addBatch();

        preparedStatement.executeBatch();




    }
}
