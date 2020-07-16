package com.dxc.jparest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeinfo")
public class Employee {

	@Column(name = "empid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "empname", nullable = true, length = 255)
	private String name;

	@Column(name = "empemail", nullable = true, length = 255)
	private String email;

	@Column(name = "empcity", nullable = true, length = 255)
	private String city;

	@Column(name = "empcountry", nullable = true, length = 255)
	private String country;

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, String email, String city, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return "Employee\n{\nid: " + id + "\nname: " + name + "\nemail: " + email +
				"\ncity: " + city + "\ncountry: "+ country + "\n}";
	}
}
