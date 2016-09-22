import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcConnection {
	public static Connection getConn() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	}//getConn
}//class
