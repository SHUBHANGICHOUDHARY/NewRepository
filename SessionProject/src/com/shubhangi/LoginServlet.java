package com.shubhangi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns= {"/LoginServlet"},initParams= @WebInitParam(name="defaultUser", value = "Shubhangi"))
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() 
    {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String username=request.getParameter("username");
		HttpSession session=request.getSession();
		ServletContext context=request.getServletContext();
		if(username!="" && username!=null)
		{
			session.setAttribute("Username", username);
			context.setAttribute("Username", username);
			
		}
		writer.println("Request parameter has username as "+username);
		writer.println("Session parameter has username as "+(String)session.getAttribute("Username"));
		writer.println("Context parameter has username as "+(String)session.getAttribute("Username"));
		writer.println("Init parameter has defualt username as "+getServletConfig().getInitParameter("defaultUser"));
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}

}
