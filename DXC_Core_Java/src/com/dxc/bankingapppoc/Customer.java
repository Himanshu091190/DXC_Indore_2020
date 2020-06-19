package com.dxc.bankingapppoc;

public class Customer {
	
	int operationCounter;
	String name,email,phone,balance;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public int getOperationCounter() {
		return operationCounter;
	}

	public void setOperationCounter(int operationCounter) {
		this.operationCounter = operationCounter;
	}
}
