package com.trungtamjava.connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LuuFile {
    public static void main(String[] args) throws FileNotFoundException, SQLException {
        File file = new File("test.txt");

        FileInputStream fileInputStream = new FileInputStream(file);

        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "insert into file(name,file) values(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,"test.txt");
        preparedStatement.setBinaryStream(2,fileInputStream);

        preparedStatement.executeUpdate();
        System.out.println("them file thanh cong");
    }
}
