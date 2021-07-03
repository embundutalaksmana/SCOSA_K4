package konfigurasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CONFIG {
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException {
        try{
            String url = "jdbc:mysql://localhost/database_scosa";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Gagal Mengoneksikan Ke Database" + e.getMessage());
        }
        return MySQLConfig;   
    }   
}