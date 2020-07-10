package com.dxc.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import com.dxc.jpa.employee.Employee;

public class PersistEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DxcJPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Create and Insert into Table
//		Employee mEmployee = new Employee();
//		mEmployee.setE_id(101);
//		mEmployee.setE_name("himanshu");
//		mEmployee.setE_age(29);
//		
//		Employee mEmployee1 = new Employee();
//		mEmployee1.setE_id(102);
//		mEmployee1.setE_name("Rohan");
//		mEmployee1.setE_age(25);
//		
//		Employee mEmployee2 = new Employee();
//		mEmployee2.setE_id(103);
//		mEmployee2.setE_name("Sohan");
//		mEmployee2.setE_age(30);
//		
//		em.persist(mEmployee);
//		em.persist(mEmployee1);
//		em.persist(mEmployee2);
//		
//		em.getTransaction().commit();
		
		// Find the Data from Database
//		Employee mFindEmployee = em.find(Employee.class, 101);
//		System.out.println("Employee ID is "+mFindEmployee.getE_id());
//		System.out.println("Employee Name is "+mFindEmployee.getE_name());
//		System.out.println("Employee Age is "+mFindEmployee.getE_age());
		
		
		// Updating the Code in DB
//		Employee mUpdateEmployee = em.find(Employee.class, 102);
//		System.out.println("]Before Update the Data is \n");
//		System.out.println("Employee ID is "+mUpdateEmployee.getE_id());
//		System.out.println("\nEmployee Name is "+mUpdateEmployee.getE_name());
//		System.out.println("\nEmployee Age is "+mUpdateEmployee.getE_age());
//		
//		mUpdateEmployee.setE_age(35);
//		System.out.println("\n===================\nAfter Update the Data is \n\n");
//		System.out.println("Employee ID is "+mUpdateEmployee.getE_id());
//		System.out.println("\nEmployee Name is "+mUpdateEmployee.getE_name());
//		System.out.println("\nEmployee Age is "+mUpdateEmployee.getE_age());
		
		
		// Delete entry in DB
//		Employee mDeleteEmployee = em.find(Employee.class, 102);
//		em.remove(mDeleteEmployee);
//		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
