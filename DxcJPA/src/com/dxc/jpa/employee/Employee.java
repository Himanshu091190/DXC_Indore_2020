package com.dxc.jpa.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	int e_id;
	String e_name;
	int e_age;
	
	public Employee() {
		super();
	}
	
	public Employee(int e_id, String e_name, int e_age) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_age = e_age;
	}
	
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_age() {
		return e_age;
	}
	public void setE_age(int e_age) {
		this.e_age = e_age;
	}
}
