package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionDB {
	public static Connection connect(){
	    Connection con = null;
	    
	    try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject?", "root", "");
	    System.out.println("Connection to db : complete");
	    
	    }//end of try

	    catch(Exception e){
	        System.out.println("The error was : " + e);
	        
	    }//end of catch
	    return con;
	    
	    
	    
	    }//end of method

}

