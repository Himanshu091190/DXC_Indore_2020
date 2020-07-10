package com.dxc.jpa.persist;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dxc.mappings.ManyToManyLibrary;
import com.dxc.mappings.ManyToManyStudent;

public class ManyToManyExample {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mappings");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		ManyToManyStudent stud1 = new ManyToManyStudent(1,"John",null);
		ManyToManyStudent stud2 = new ManyToManyStudent(2,"David",null);
		
		em.persist(stud1);
		em.persist(stud2);
		
		ArrayList<ManyToManyStudent> al1 = new ArrayList<ManyToManyStudent>();
		ArrayList<ManyToManyStudent> al2 = new ArrayList<ManyToManyStudent>();
		
		al1.add(stud1);
		al1.add(stud2);
		
		al2.add(stud1);
		al2.add(stud2);
		
		ManyToManyLibrary lib1 = new ManyToManyLibrary(101,"Core Java", al1);
		ManyToManyLibrary lib2 = new ManyToManyLibrary(102,"DBMS", al2);
		
		em.persist(lib1);
		em.persist(lib2);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
