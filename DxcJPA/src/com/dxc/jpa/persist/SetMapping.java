//package com.dxc.jpa.persist;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import com.dxc.jpa.employee.Address;
//import com.dxc.jpa.employee.DxcEmployee;
//
//public class SetMapping {
//
//	public static void main(String[] args) {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("collection_types");
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		
//		Address a1 = new Address();
//		a1.setEmp_pincode("201301");
//		a1.setEmp_city("Noida");
//		a1.setEmp_state("Uttar Pradesh");
//		
//		Address a2 = new Address();
//		a2.setEmp_pincode("302001");
//		a2.setEmp_city("Jaipur");
//		a2.setEmp_state("Rajasthan");
//		
//		Address a3 = new Address();
//		a3.setEmp_pincode("133301");
//		a3.setEmp_city("Chandigarh");
//		a3.setEmp_state("Punjab");
//		
//		Address a4 = new Address();
//		a4.setEmp_pincode("80001");
//		a4.setEmp_city("Patna");
//		a4.setEmp_state("Bihar");
//		
//		DxcEmployee e1 = new DxcEmployee();
//		e1.setEmp_id(1);
//		e1.setEmp_name("John");
//		e1.getMsetAddress().add(a1);
//		
//		DxcEmployee e2 = new DxcEmployee();
//		e2.setEmp_id(2);
//		e2.setEmp_name("Shawn");
//		e2.getMsetAddress().add(a2);
//		
//		DxcEmployee e3 = new DxcEmployee();
//		e3.setEmp_id(3);
//		e3.setEmp_name("Williams");
//		e3.getMsetAddress().add(a3);
//		
//		DxcEmployee e4 = new DxcEmployee();
//		e4.setEmp_id(4);
//		e4.setEmp_name("David");
//		e4.getMsetAddress().add(a4);
//		
//		em.persist(e1);
//		em.persist(e2);
//		em.persist(e3);
//		em.persist(e4);
//		
//		em.getTransaction().commit();
//		em.close();
//		emf.close();
//	}
//
//}
