package com.trungtamjava.connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Procedure {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();

        CallableStatement callableStatement = connection.prepareCall("{call findPerson(?)}");

        callableStatement.setString(1,"A");

        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")+resultSet.getString("name"));
        }
    }
}
