package com.dxc.springcore;

public class Address {

	String city, state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String toString() {
		return "City: " + city + ", State: " + state + ", Country: " + country;
	}
}
