package com.cybage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddServ
 */
@WebServlet("/HiddServ")
public class HiddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HiddServ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String n1=request.getParameter("val1");  
	        String n2=request.getParameter("val2");  
	        
	        
	        String choice = request.getParameter("op");
	       
	          
	          
	        //creating form that have invisible textfield  
	        
	        
	        out.print("<form action='Add'>");  
	        out.print("<input type='hidden' name='val1' value='"+n1+"'>");  
	        out.print("<input type='hidden' name='val2' value='"+n2+"'>");
	        out.print("<input type='hidden' name='op' value='"+choice+"'>");
	        out.print("<input type='submit' value='go'>");  
	       out.print("</form>");  
	        out.close();  
	        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
