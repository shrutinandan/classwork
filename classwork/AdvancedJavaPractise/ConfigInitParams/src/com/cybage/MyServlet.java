package com.cybage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(
		urlPatterns = { "/MyServlet" }, 
		initParams = { 
				@WebInitParam(name = "name1", value = "saurabh"), 
				@WebInitParam(name = "name2", value = "shruti"), 
				@WebInitParam(name = "name3", value = "shradha"), 
				@WebInitParam(name = "name4", value = "shailja")
		})
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		ServletConfig sc = getServletConfig();
		  Enumeration<String> e= sc.getInitParameterNames();
		
	        while(e.hasMoreElements()){
	        String s = e.nextElement();
	        out.println(s);
	        out.println(sc.getInitParameter(s));
	        out.println("-------------------------------------");
	        	
	         
	        }
	        
	        //out.println(e);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
