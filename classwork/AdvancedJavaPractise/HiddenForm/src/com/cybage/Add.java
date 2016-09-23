package com.cybage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
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
          
        
        
       // out.println(request.getParameter("val1"));
        //Getting the value from the hidden field  
        int n1=Integer.parseInt(request.getParameter("val1"));  
        int n2=Integer.parseInt(request.getParameter("val2"));  
        int choice=Integer.parseInt(request.getParameter("op"));  
        if(choice==1)
        out.print(n1+n2);
        else if(choice==2)
        	out.print(n1-n2);
        else if(choice==3)
        	out.print(n1*n2);
        else
        	out.print("invalid choice");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
