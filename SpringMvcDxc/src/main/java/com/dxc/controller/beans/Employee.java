package com.dxc.controller.beans;

public class Employee {

	int id;
	String name, designation;
	float salary;
	
	public Employee(int id, String name, String designation, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
