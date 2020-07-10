package com.dxc.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dxc.jpa.employee.Address;
import com.dxc.jpa.employee.DxcEmployee;

public class ListMapping {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("collection_types");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Address a1 = new Address();
		a1.setEmp_pincode("201301");
		a1.setEmp_city("Noida");
		a1.setEmp_state("Uttar Pradesh");
		
		Address a2 = new Address();
		a2.setEmp_pincode("302001");
		a2.setEmp_city("Jaipur");
		a2.setEmp_state("Rajasthan");
		
		DxcEmployee e1 = new DxcEmployee();
		e1.setEmp_id(1);
		e1.setEmp_name("John");
		e1.getAddress().add(a1);
		
		DxcEmployee e2 = new DxcEmployee();
		e2.setEmp_id(2);
		e2.setEmp_name("Shawn");
		e2.getAddress().add(a2);
		
		em.persist(e1);
		em.persist(e2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
