package jdbcsample;
import com.mysql.jdbc.Driver;

import java.sql.*;

public class JdbcSample {
    private static final String username = "KeNIRQpw5H";
    private static final String password = "twbp67bIeh";
    private static final String CONN = "jdbc:mysql://remotemysql.com:3306/KeNIRQpw5H";

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            con = DriverManager.getConnection(CONN,username,password);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("select * from Students");
            rs.last();
            System.out.println("connected");
            System.out.println(rs.getRow());
        }catch (SQLException e){
            System.err.println(e);
        }finally {
            if(con != null){
                con.close();
            }
        };

    }
}
