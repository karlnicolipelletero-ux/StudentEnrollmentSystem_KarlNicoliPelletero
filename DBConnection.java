package enrollmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/enrollment_db";
            String user = "root"; 
            String password = "Karlnicoli123"; 
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            
            // You can leave this print statement or delete it, up to you!
            System.out.println("Database Connection Successful!"); 
            
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
        return con;
    }
}