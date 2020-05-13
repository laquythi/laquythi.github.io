package com.trungtamjava.connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class DatabaseMeta {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();

        DatabaseMetaData databaseMetaData = connection.getMetaData();

//        System.out.println(databaseMetaData.getDatabaseProductName());
//        System.out.println(databaseMetaData.getUserName());

        System.out.println(databaseMetaData.getURL());

    }
}
