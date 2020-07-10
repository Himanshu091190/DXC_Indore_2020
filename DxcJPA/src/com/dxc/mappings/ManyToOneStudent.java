package com.dxc.mappings;

import javax.persistence.*;
@Entity
public class ManyToOneStudent {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	
	@ManyToOne
	ManyToOneLibrary lib;

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

	public ManyToOneLibrary getLib() {
		return lib;
	}

	public void setLib(ManyToOneLibrary lib) {
		this.lib = lib;
	}
}
