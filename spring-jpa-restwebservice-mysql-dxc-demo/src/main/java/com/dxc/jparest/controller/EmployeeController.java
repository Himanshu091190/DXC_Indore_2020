package com.dxc.jparest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.jparest.entity.Employee;
import com.dxc.jparest.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	// http://localhost:8562/employee/all
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		return this.employeeService.getAllEmployees();
	}

	// http://localhost:8562/employee/addEmployee
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}

	// http://localhost:8562/employee/updateEmployee
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}

	// http://localhost:8562/employee/1
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return this.employeeService.getEmployeeById(id);
	}

	// http://localhost:8562/employee/all
	@RequestMapping(value = "/all", method = RequestMethod.DELETE)
	public void deleteAllEmployees() {
		this.employeeService.deleteAllEmployees();
	}

	// http://localhost:8562/employee/1
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int id) {
		this.employeeService.deleteEmployeeById(id);
	}
}
