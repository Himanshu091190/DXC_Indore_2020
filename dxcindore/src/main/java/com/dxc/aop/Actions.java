package com.dxc.aop;

public class Actions {
	
	
	public void showName() {
		System.out.println("showName() method is used to display Name");
	}
	
	public void showEmail() {
		System.out.println("showEmail() method is used to display Email");
	}
	
	public int getSalary() {
		System.out.println("getSalary() method is used to display salary");
		return 5000;
	}
	
	public int getAge() {
		System.out.println("getAge() method is used to display age");
		return 30;
	}
	
	public void getResult(int marks) throws Exception {
		if(marks < 40) 
			throw new ArithmeticException("Your Child has failed the session kindly repeat the session again !!");
		else
			System.out.println("Congrats !! You are promoted to next class");
	}

}
