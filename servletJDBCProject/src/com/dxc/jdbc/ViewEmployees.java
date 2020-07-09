package com.dxc.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewEmployees
 */
@WebServlet("/ViewEmployees")
public class ViewEmployees extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Employee> mList = new ArrayList<Employee>();
		try {
			mList = EmployeeDAO.getAllEmployees();
			// Do the parsing of List
			
			PrintWriter pw = response.getWriter();
			
			pw.print("<html><body><table><tr>");
			pw.print("<th>ID</th><th>Name</th><th>Email</th><th>Password</th><th>Country</th>");
			
			for(Employee mEmployee: mList) {
				pw.print("<tr>");
				pw.print("<td>"+mEmployee.getId()+"</td>");
				pw.print("<td>"+mEmployee.getName()+"</td>");
				pw.print("<td>"+mEmployee.getEmail()+"</td>");
				pw.print("<td>"+mEmployee.getPassword()+"</td>");
				pw.print("<td>"+mEmployee.getCountry()+"</td>");
				pw.print("</tr>");
			}
			
			pw.print("</tr></table></body></html>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
