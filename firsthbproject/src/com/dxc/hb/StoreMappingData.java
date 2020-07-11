package com.dxc.hb;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreMappingData {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		/***** One to One Mapping ********/
		/*Address mAddress = new Address();
		mAddress.setAddressLine1("49/3, Ashok Nagar");
		mAddress.setCity("New Delhi");
		mAddress.setState("New Delhi");
		mAddress.setCountry("India");
		
		Employee mEmployee = new Employee();
		mEmployee.setName("Himanshu Sharma");
		mEmployee.setEmail("himanshu091190@hotmail.com");
		mEmployee.setAddress(mAddress);
		
		mAddress.setEmployee(mEmployee);*/
		
		/************* One To Many Mapping  **********/
		/*Answer ans1 = new Answer();
		ans1.setAnswername("China");
		ans1.setPostedBy("Himanshu");
		
		Answer ans2 = new Answer();
		ans2.setAnswername("Java");
		ans2.setPostedBy("Developer");
		
		Answer ans3 = new Answer();
		ans3.setAnswername("Narendra Modi");
		ans3.setPostedBy("Rohit");
		
		Answer ans4 = new Answer();
		ans4.setAnswername("BJP");
		ans4.setPostedBy("Sohan");
		
		ArrayList<Answer> list1 = new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		
		ArrayList<Answer> list2 = new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);
		
		Question q1 = new Question();
		q1.setQuestionName("Who Spread Corona Virus in 2020 ?");
		q1.setAnswers(list1);
		
		Question q2 = new Question();
		q2.setQuestionName("Who is Prime Minister of India?");
		q2.setAnswers(list2);
		
		session.persist(q1);
		session.persist(q2);*/
		
		/*********  Many to One Mapping********/
		/*Address mAddress = new Address();
		mAddress.setAddressLine1("49/3, Ashok Nagar");
		mAddress.setCity("New Delhi");
		mAddress.setState("New Delhi");
		mAddress.setCountry("India");
		
		Employee mEmployee = new Employee();
		mEmployee.setName("Himanshu Sharma");
		mEmployee.setEmail("himanshu091190@hotmail.com");
		mEmployee.setAddress(mAddress);
		
		Employee mEmployee1 = new Employee();
		mEmployee1.setName("Rohit Sharma");
		mEmployee1.setEmail("rohit@hotmail.com");
		mEmployee1.setAddress(mAddress);
		
		session.persist(mEmployee);
		session.persist(mEmployee1);*/
		
		/********* Many To Many Mapping  *******/
		Answer ans1 = new Answer();
		ans1.setAnswername("China");
		ans1.setPostedBy("Himanshu");
		
		Answer ans2 = new Answer();
		ans2.setAnswername("Java");
		ans2.setPostedBy("Developer");
		
		Answer ans3 = new Answer();
		ans3.setAnswername("Narendra Modi");
		ans3.setPostedBy("Rohit");
		
		Answer ans4 = new Answer();
		ans4.setAnswername("BJP");
		ans4.setPostedBy("Sohan");
		
		ArrayList<Answer> list1 = new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		
		ArrayList<Answer> list2 = new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);
		
		Question q1 = new Question();
		q1.setQuestionName("Who Spread Corona Virus in 2020 ?");
		q1.setAnswers(list1);
		
		Question q2 = new Question();
		q2.setQuestionName("Who is Prime Minister of India?");
		q2.setAnswers(list2);
		
		session.persist(q1);
		session.persist(q2);
		
		
		t.commit();
		session.close();
		factory.close();
	}

}
