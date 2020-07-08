package com.dxc.servletsprogram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		if(username.equalsIgnoreCase("himanshu") && password.equalsIgnoreCase("sharma")) {
			pw.print("<html><body>");
			pw.print(username+", "+password);
			pw.print("</body></html>");	
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("/welcome");
			rd.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
