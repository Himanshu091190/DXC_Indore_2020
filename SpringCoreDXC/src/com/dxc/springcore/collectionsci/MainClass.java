package com.dxc.springcore.collectionsci;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.dxc.springcore.Employee;

public class MainClass {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
//		Question s = (Question) factory.getBean("q");
		Question s = (Question) factory.getBean("q1");
		s.displayInfo();
	}

}
