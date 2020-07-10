package com.dxc.jpa.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dxc.mappings.ManyToOneLibrary;
import com.dxc.mappings.ManyToOneStudent;

public class ManyToOneExample {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mappings");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		ManyToOneLibrary lib1 = new ManyToOneLibrary();
		lib1.setB_id(101);
		lib1.setB_name("Core Java");
		
		em.persist(lib1);
		
		
		ManyToOneStudent stud1 = new ManyToOneStudent();
		stud1.setId(1);
		stud1.setName("John");
		stud1.setLib(lib1);
		
		ManyToOneStudent stud2 = new ManyToOneStudent();
		stud2.setId(2);
		stud2.setName("David");
		stud2.setLib(lib1);
		
		em.persist(stud1);
		em.persist(stud2);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
