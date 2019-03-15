package com.shubh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello from Get method");
		
		
		PrintWriter writer=response.getWriter();
		String userName1=request.getParameter("username");
		String password1=request.getParameter("password");
		if(userName1.equals("Shubh")&&password1.equals("1234"))
		{
			writer.println("WELCOME "+userName1);
		}
		else
		{
			writer.println("INvalid credentials");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//doGet(request, response);
	System.out.println("Hello from Post method");
		
		
		PrintWriter writer=response.getWriter();
		String userName1=request.getParameter("username");
		String password1=request.getParameter("password");
		if(userName1.equals("Shubh")&&password1.equals("1234"))
		{
			writer.println("WELCOME "+userName1);
		}
		else
		{
			writer.println("Invalid credentials");
		}
		
	}
	}


