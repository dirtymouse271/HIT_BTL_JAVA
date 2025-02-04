package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() throws SQLException {
        Connection c = null;
        try {
            c = null;
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            String url ="jdbc:mysql://localhost:3306/hotelmanager";
            String name ="root";
            String password ="cheetah271";

            c = DriverManager.getConnection(url,name,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void closeConnection(Connection c) throws SQLException {
        try {
            if(c != null){
                c.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
