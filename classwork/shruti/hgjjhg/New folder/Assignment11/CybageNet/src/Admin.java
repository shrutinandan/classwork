

import java.awt.SecondaryLoop;
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
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
			String adminOperation=request.getParameter("btn");
			System.out.println(adminOperation);

			if(adminOperation.equalsIgnoreCase("Insert A Book"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("adminInsert.html");
				rd.forward(request, response);
				/*response.sendRedirect("adminInsert.html");*/
			}
			else if(adminOperation.equalsIgnoreCase("Remove A Book")){
				
				RequestDispatcher rd=request.getRequestDispatcher("adminRemove.html");
				rd.forward(request, response);
			}
			
	}

}
