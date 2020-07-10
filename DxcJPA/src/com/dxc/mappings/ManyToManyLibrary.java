package com.dxc.mappings;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ManyToManyLibrary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int b_id;
	String b_name;

	@ManyToMany(targetEntity = ManyToManyStudent.class)
	List mList;

	public ManyToManyLibrary(int b_id, String b_name, List mList) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.mList = mList;
	}

	public ManyToManyLibrary() {
		super();
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public List getmList() {
		return mList;
	}

	public void setmList(List mList) {
		this.mList = mList;
	}
}
