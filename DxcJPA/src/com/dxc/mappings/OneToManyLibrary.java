package com.dxc.mappings;

import javax.persistence.*;

@Entity
public class OneToManyLibrary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int b_id;
	String b_name;
	
	public OneToManyLibrary(int b_id, String b_name) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
	}
	
	public OneToManyLibrary() {
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
}
