

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminRemove
 */
@WebServlet("/AdminRemove")
public class AdminRemove extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRemove() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		try {
			Connection conn=JdbcConnection.getConn();
			PreparedStatement pst1 = conn.prepareStatement("Delete from cybagebooks where bookid=(?)");
			pst1.setInt(1, bookid);
			int row=pst1.executeUpdate();
			System.out.println(row);
			pw.println("<h2>Boook Removed sucessfully..</h2>");
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
