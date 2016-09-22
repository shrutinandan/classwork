import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;


public class ProcedureDemo {
	public static void main(String[] args) 
	{
		 
		  
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root","root");
			  
			CallableStatement stmt=con.prepareCall("{call proc1(?)}"); 
			stmt.registerOutParameter(1,Types.INTEGER);
			stmt.execute();  
			System.out.println(stmt.getInt(1)); 
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}  
		
		  
		 
	}

}
