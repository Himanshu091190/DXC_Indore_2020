package com.dxc.oops;

// Read and Write Classes
class DxcEmployee {
	String name, empid, city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}	
}

public class EncapsulationExample {
	public static void main(String[] args) {
			DxcEmployee mObject = new DxcEmployee();
			mObject.setCity("New Delhi");
			mObject.setEmpid("321456");
			mObject.setName("Raju Rohan");
			
			System.out.println(mObject.getCity());
			System.out.println(mObject.getEmpid());
			System.out.println(mObject.getName());
	}

}
