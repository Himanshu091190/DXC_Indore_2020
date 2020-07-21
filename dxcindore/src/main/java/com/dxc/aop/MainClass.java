package com.dxc.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Actions actions = (Actions) context.getBean("actionBean");
		
//		System.out.println("Invoking showName()");
//		actions.showName();
		
		System.out.println("Invoking showSalary()");
		actions.getSalary();
		
		System.out.println("Invoking showAge()");
		actions.getAge();
		
	}

}
