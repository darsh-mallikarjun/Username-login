package com.login.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class UserLogin extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html");
    	PrintWriter out=resp.getWriter();
    
			String name=req.getParameter("uname");
		
			
			if(name.equalsIgnoreCase("Darshan"))
			{
					RequestDispatcher rd =req.getRequestDispatcher("/index1.jsp");
					rd.forward(req, resp);
			}
			else
			{   
				out.println("<h1>Incorrect Username</h1>");
				RequestDispatcher rd =req.getRequestDispatcher("/index.jsp");
				rd.include(req, resp);
			}
    }
}
