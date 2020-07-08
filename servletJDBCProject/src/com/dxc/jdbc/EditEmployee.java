package com.dxc.jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditEmployee
 */
@WebServlet("/EditEmployee")
public class EditEmployee extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int empID = Integer.parseInt(request.getParameter("empid"));
		String empName = request.getParameter("empname");
		String empEmail = request.getParameter("empemail");
		String empPWD = request.getParameter("emppwd");
		String empCountry = request.getParameter("empcountry");
		
		Employee mEmployee = new Employee();
		mEmployee.setId(empID);
		mEmployee.setName(empName);
		mEmployee.setPassword(empPWD);
		mEmployee.setEmail(empEmail);
		mEmployee.setCountry(empCountry);
		
		try {
			EmployeeDAO.editEmployee(mEmployee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
