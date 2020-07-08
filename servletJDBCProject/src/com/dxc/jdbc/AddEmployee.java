package com.dxc.jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empName = request.getParameter("empname");
		String empEmail = request.getParameter("empemail");
		String empPWD = request.getParameter("emppwd");
		String empCountry = request.getParameter("empcountry");
		
		Employee mEmployee = new Employee();
		mEmployee.setName(empName);
		mEmployee.setPassword(empPWD);
		mEmployee.setEmail(empEmail);
		mEmployee.setCountry(empCountry);
		
		try {
			EmployeeDAO.saveEmployee(mEmployee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
