package com.dxc.springcore;

public class Employee {

	int id;
	String name;
	Address address;
	
	public Employee(int id) {
		super();
		this.id = id;
	}
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public Employee() {
		super();
		System.out.println("Default Constructor");
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void show() {
		System.out.println("Id is "+id+", Name is "+name);
		System.out.println(address.toString());
	}
}
