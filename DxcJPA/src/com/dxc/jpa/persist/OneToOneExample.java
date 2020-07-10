package com.dxc.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dxc.mappings.Library;
import com.dxc.mappings.Student;

public class OneToOneExample {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mappings");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("David");

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("John");
		
		em.persist(s1);
		em.persist(s2);
		
		Library lib1 = new Library();
		lib1.setB_id(101);
		lib1.setB_name("Core Java");
		lib1.setStud(s1);
		
		Library lib2 = new Library();
		lib2.setB_id(102);
		lib2.setB_name("DBMS");
		lib2.setStud(s2);
		
		em.persist(lib1);
		em.persist(lib2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
