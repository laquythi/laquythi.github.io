package com.trungtamjava.connection;

import com.sun.org.apache.xerces.internal.impl.XMLEntityScanner;

import java.sql.*;

public class MetaData {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();

        Statement statement = connection.createStatement();

        String sql = "select * from person";

        ResultSet rs = statement.executeQuery(sql);
        ResultSetMetaData metaData = rs.getMetaData();

//        System.out.println(metaData.getColumnCount());
//
//        System.out.println(metaData.getColumnName(1));
//        System.out.println(metaData.getColumnName(2));

        System.out.println(metaData.getColumnTypeName(2));
}
}
