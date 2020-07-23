package com.dxc.aop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Actions actions = (Actions) context.getBean("actionBean");
		
//		System.out.println("Invoking showName()");
//		actions.showName();
		
//		System.out.println("Invoking showSalary()");
//		actions.getSalary();
		
//		System.out.println("Invoking showAge()");
//		actions.getAge();
		
//		try {
//			actions.getResult(45);
//		}
//		catch(Exception e) {
//			System.out.println("Exception is "+e);
//		}
		
		
//		try {
//			actions.getResult(10);
//		}
//		catch(Exception e) {
//			System.out.println("Exception is "+e);
//		}
		
//		actions.showName();
//		actions.showEmail();
		
		Customer mCustomer = (Customer) context.getBean("customerBean");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to IBS! Select Your Choice\n\n");
		System.out.println("1. Open Account\n2. Deposit\n3. Withdrawl\n4. Check Balance\n\n");
		int userChoice  = Integer.parseInt(buff.readLine());
		switch(userChoice) {
		case 1: 
			System.out.println("Enter your First Name");
			String fname = buff.readLine();
			System.out.println("Enter your Last Name");
			String lname = buff.readLine();
			System.out.println("Enter your Age");
			int age = Integer.parseInt(buff.readLine());
			mCustomer.openAccount(fname, lname, age);
			break;
		case 2: 
			System.out.println("Enter your Amount to be Deposited");
			int depositAmount = Integer.parseInt(buff.readLine());
			mCustomer.deposit(depositAmount);
			break;
		case 3: 
			System.out.println("Enter your Amount to be Withdrawl");
			int withdrawlAmount = Integer.parseInt(buff.readLine());
			mCustomer.withdrawl(withdrawlAmount);
			break;
		case 4: 
			mCustomer.getBalance();
			break;
		default: System.out.println("No Choice Opted");
		}
	}

}
