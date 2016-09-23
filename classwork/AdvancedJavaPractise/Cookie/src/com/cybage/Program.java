package com.cybage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Program
 */
@WebServlet("/Program")
public class Program extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Program() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    try{  
	    	  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	              
	        String n1=request.getParameter("name"); 
	        String n2=request.getParameter("date");  
	        String n3=request.getParameter("address");  
	        //out.print("Welcome "+n1);  
	        
	        
	      
	        /*Cookie ck=new Cookie("uname",n1);//creating cookie object  
	        response.addCookie(ck);//adding cookie in the response  
	        Cookie ck1=new Cookie("date",n2);//creating cookie object  
	        response.addCookie(ck1);//adding cookie in the response  
	        Cookie ck2=new Cookie("address",n3);//creating cookie object  
	        response.addCookie(ck2);//adding cookie in the response  
	      */
	      /*  //creating submit button  
	       out.print("<form action='Quali.html'>");  
	        out.print("<input type='hidden' name='name' value='"+n1+"'>");  
	        out.print("<input type='hidden' name='date' value='"+n2+"'>");
	        out.print("<input type='hidden' name='address' value='"+n3+"'>");
	        out.print("<input type='submit' value='next page'>");  
	        out.print("</form>");  */
	       /*out.print(ck);   
	       out.print(ck1); 
	       out.print(ck2); */
	        
	        HttpSession session=request.getSession();  
	        session.setAttribute("name",n1);  
	        session.setAttribute("date",n2);  
	        session.setAttribute("address",n3);  
	        System.out.println(n1);
	        
	       response.sendRedirect("Quali.html");
	        out.close();  
	      
	            }catch(Exception e){System.out.println(e);}  
	      }  
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
