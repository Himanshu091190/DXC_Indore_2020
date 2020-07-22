package com.dxc.main;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping(value = "/api/login", method=RequestMethod.GET)
	public String listEmployees(){
		return "List of Employees from Swagger Application";
	}

	
	// Handler Mapper for Displaying a new Employee Form
	@RequestMapping(value = "/api/login.newEmployee", method = RequestMethod.GET)
	public String newEmployee() {
		return "New Employee from Swagger Application";
	}

	// Handler Mapper for Inserting/Updating Employee
	@RequestMapping(value = "/api/login.saveEmployee", method = RequestMethod.GET)
	public String saveEmployee()  {
		return "Save Employee from Swagger Application";
	}

	// Handler Mapper for Deleting Employee
	@RequestMapping(value = "/api/login.deleteEmployee", method = RequestMethod.GET)
	public String deleteEmployee() throws IOException {
		return "Delete Employee from Swagger Application";
	}

	// Handler Mapper for Deleting Employee
	@RequestMapping(value = "/api/login.editEmployee", method = RequestMethod.GET)
	public String editEmployee() throws IOException {
		return "Edit Employee from Swagger Application";
	}
}
