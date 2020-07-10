package com.dxc.mappings;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OneToManyStudent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	
	@OneToMany(targetEntity = OneToManyLibrary.class)
	List books_issued;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getBooks_issued() {
		return books_issued;
	}

	public void setBooks_issued(List books_issued) {
		this.books_issued = books_issued;
	}
}
