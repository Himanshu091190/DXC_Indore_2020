package com.dxc.servletsprogram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("Welcome to Servlets");
		
		HttpSession session = request.getSession(false);
		String username = (String) session.getAttribute("uname");
		String password = (String) session.getAttribute("pwd");
		String atmpinhidden = (String) session.getAttribute("atmpin");
		
		pw.println("Username is "+username+"<br><br>");
		pw.println("Password is "+password+"<br><br>");
		pw.println("ATM PIN is "+atmpinhidden+"<br><br><br><br>");
		
		
		Cookie mCookie[] = request.getCookies();
		if(mCookie != null) {
			pw.println("Your username is "+ mCookie[0].getValue());
			pw.println("Your password is "+mCookie[1].getValue());
		}
		else
			pw.println("no cookie");
			pw.println("</body></html>");
		//response.sendRedirect("https://www.google.com/");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
