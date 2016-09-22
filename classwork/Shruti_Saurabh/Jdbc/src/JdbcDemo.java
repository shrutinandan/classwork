

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class JdbcDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root","root");
		 //con.setAutoCommit(false);
		 Statement stm =  con.createStatement();
		 String sql = "SELECT * FROM emp";
		 ResultSet rs = stm.executeQuery(sql);
	      
	      while(rs.next()){
	        
	         int id  = rs.getInt("eid");
	         String name = rs.getString("ename");
	         System.out.println("ID: " + id);
	         System.out.println("Name: " + name);
	         
	      }
	      rs.close();
	      
	      
	      PreparedStatement stmt = null;
	   }
	}


