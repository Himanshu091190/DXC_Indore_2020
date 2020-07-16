package com.dxc.jparest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.jparest.dao.EmployeeDAO;
import com.dxc.jparest.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO employeeDao;
	
	public List<Employee> getAllEmployees() {
		return this.employeeDao.findAll();
	}
	
	public Employee addEmployee(Employee employee) {
		return this.employeeDao.save(employee);
	}
	
	// Optional is a Container object which may or may not contain non null values
	public Optional <Employee> getEmployeeById(int id ) {
		return this.employeeDao.findById(id);
	}
	
	public Employee updateEmployee(Employee employee) {
		return this.employeeDao.save(employee);
	}
	
	public void deleteEmployeeById(int id) {
		this.employeeDao.deleteById(id);
	}
	
	public void deleteAllEmployees() {
		this.employeeDao.deleteAll();
	}
}
