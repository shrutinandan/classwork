

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();

		int id=Integer.parseInt(request.getParameter("empid"));
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String dept=request.getParameter("department");

		try {
			Connection conn=JdbcConnection.getConn();
			PreparedStatement pst1 = conn.prepareStatement("Insert into cybageemployee values(?,?,?,?,'U')");
			pst1.setInt(1, id);
			pst1.setString(2, password);
			pst1.setString(3, name);
			pst1.setString(4, dept);

			int row=pst1.executeUpdate();
			System.out.println(row);
			pw.println("You Are successfully registered...Now Login");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			


		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}		


	}
}
