package com.dxc.aop;

public class Customer {

	String fname, lname;
	int age, balance;
	
	public Customer() {
	}
	
	public Customer(int balance) {
		super();
		this.balance = balance;
	}

	public void openAccount(String fname, String lname, int age) throws Exception {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
			if(age < 18) 
				throw new ArithmeticException("Your age is not perfect for opening account !!");
			else
				System.out.println("Congrats !! Your account is opened");
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	public void withdrawl (int amount) throws Exception {
		if(balance-amount < 1000)
			throw new ArithmeticException("Your min balance is less than 1000 after this transaction !!");
		else
			balance = balance - amount;
	}
	
	public int getBalance() {
		return balance;
	}
}
