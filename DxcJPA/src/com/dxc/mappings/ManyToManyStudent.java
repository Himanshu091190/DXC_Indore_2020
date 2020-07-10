package com.dxc.mappings;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ManyToManyStudent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;

	@ManyToMany(targetEntity = ManyToManyLibrary.class)
	List mList;

	public ManyToManyStudent(int id, String name, List mList) {
		super();
		this.id = id;
		this.name = name;
		this.mList = mList;
	}

	public ManyToManyStudent() {
		super();
	}

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

	public List getmList() {
		return mList;
	}

	public void setmList(List mList) {
		this.mList = mList;
	}
}
