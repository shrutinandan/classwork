

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
 * Servlet implementation class AdminInsert
 */
@WebServlet("/AdminInsert")
public class AdminInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int bookid=Integer.parseInt(request.getParameter("bookid"));
		String bookname=request.getParameter("bookname");
		String bookauthor=request.getParameter("bookauthor");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		try {
			Connection conn=JdbcConnection.getConn();
			PreparedStatement pst1 = conn.prepareStatement("Insert into cybagebooks values(?,?,?)");
			pst1.setInt(1, bookid);
			pst1.setString(2, bookname);
			pst1.setString(3, bookauthor);
			int row=pst1.executeUpdate();
			System.out.println(row);
			pw.println("<h2>Boook Added sucessfully..</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("admin.html");
			rd.include(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	
	
	
	
	
	}

}
