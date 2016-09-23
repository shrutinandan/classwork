package Cybage.net;


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
 * Servlet implementation class Validator
 */
@WebServlet("/Validator")
public class Validator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validator() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("in validator");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int id=Integer.parseInt(request.getParameter("empid"));
		String password=request.getParameter("password");

		//System.out.println(id+"    "+password);
		String dBpassword=null;
		String dBrole=null;
		try {
			Connection conn=JdbcConnection.getConn();
			PreparedStatement pst1 = conn.prepareStatement("Select Emppass,role from cybageemployee where empid=(?)");
			pst1.setInt(1, id); 
			ResultSet rst=pst1.executeQuery();
			if(rst.next())
			{
				dBpassword=rst.getString(1);
				//System.out.println("in rst"+dBpassword);
				dBrole=rst.getString(2);
				//System.out.println("in rst"+dBrole);
				//System.out.println(dBpassword.equals(password));
			}

			if(dBpassword==null)
			{
				pw.println("Either Wrong Employee id /You are Not registered....");
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
			else if(!dBpassword.equals(password))
			{
				pw.println("WRONG PASSWORD Retry...");
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
			else{
				if(dBrole.equals("admin"))
				{
					RequestDispatcher rd=request.getRequestDispatcher("admin.html");
					rd.forward(request, response);
				}
				else if(dBrole.equals("user"))
				{
					RequestDispatcher rd=request.getRequestDispatcher("user.html");
					rd.forward(request, response);
				}
			}



		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}		


	}

}
