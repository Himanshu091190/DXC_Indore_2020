package com.dxc.jspservlets;

public class Calculator {

	int data;
	public int square(int n) {
		return n*n;
	}
	
	public int cube(int n) {
		return n*n*n;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
