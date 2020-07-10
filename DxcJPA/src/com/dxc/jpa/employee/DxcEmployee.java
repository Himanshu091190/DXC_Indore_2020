//package com.dxc.jpa.employee;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import javax.persistence.ElementCollection;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class DxcEmployee {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	int emp_id;
//	String emp_name;
//	
//	@ElementCollection
//	List<Address> address = new ArrayList<Address>();
//	
//	@ElementCollection
//	Set<Address> msetAddress = new HashSet<Address>();
//	
//	@ElementCollection 
//	Map<Integer,Address> mMapAddress = new HashMap<Integer,Address>();
//
//	public int getEmp_id() {
//		return emp_id;
//	}
//
//	public void setEmp_id(int emp_id) {
//		this.emp_id = emp_id;
//	}
//
//	public String getEmp_name() {
//		return emp_name;
//	}
//
//	public void setEmp_name(String emp_name) {
//		this.emp_name = emp_name;
//	}
//
//	public List<Address> getAddress() {
//		return address;
//	}
//
//	public void setAddress(List<Address> address) {
//		this.address = address;
//	}
//
//	public Set<Address> getMsetAddress() {
//		return msetAddress;
//	}
//
//	public void setMsetAddress(Set<Address> msetAddress) {
//		this.msetAddress = msetAddress;
//	}
//
//	public Map<Integer, Address> getmMapAddress() {
//		return mMapAddress;
//	}
//
//	public void setmMapAddress(Map<Integer, Address> mMapAddress) {
//		this.mMapAddress = mMapAddress;
//	}
//}
