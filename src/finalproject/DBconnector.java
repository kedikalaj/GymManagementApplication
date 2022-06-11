
package finalproject;


import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;

public class DBconnector {
    
    public static Connection connect(){
        Connection conn = null;
        
        try{
          
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3306/finalproject", "root", "");
            System.out.println("Connected");;
        
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database connection error", "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("The problem is" + e);
        
        }
        
        return conn;
}
        
    }

