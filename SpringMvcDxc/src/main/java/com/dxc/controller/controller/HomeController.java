package com.dxc.controller.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.controller.beans.Employee;
import com.dxc.controller.dao.EmployeeDAO;

@Controller
public class HomeController {

	@Autowired
	EmployeeDAO employeeDAO;

	// Handler Mapper for All Employees
	@RequestMapping(value = "/")
	public ModelAndView listEmployees(ModelAndView model) throws IOException {
		List<Employee> mList = employeeDAO.list();
		model.addObject("listEmployee", mList);
		model.setViewName("home");
		return model;
	}

	// Handler Mapper for Displaying a new Employee Form
	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newEmployee(ModelAndView model) throws IOException {
		Employee mEmployee = new Employee();
		model.addObject("employee", mEmployee);
		model.setViewName("EmployeeForm");
		return model;
	}

	// Handler Mapper for Inserting/Updating Employee
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.GET)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) throws IOException {
		employeeDAO.saveOrUpdate(employee);
		return new ModelAndView("redirect:/");
	}

	// Handler Mapper for Deleting Employee
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) throws IOException {
		int employeeid = Integer.parseInt(request.getParameter("id"));
		employeeDAO.delete(employeeid);
		return new ModelAndView("redirect:/");
	}

	// Handler Mapper for Deleting Employee
	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editEmployee(HttpServletRequest request) throws IOException {
		int employeeid = Integer.parseInt(request.getParameter("id"));
		Employee emp = employeeDAO.get(employeeid);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("employee",emp);
		return model;
	}

}
