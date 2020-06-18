package com.dxc.oops;

class Employee {
	String empId, empName, empSalary;
	
	public Employee(String empId, String empName, String empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	void showData() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
	}
}

public class Student {
	
	/*String id, name, rollNo;

	public Student() {
		id = "123@DXCTraining";
		name = "Training Mentor";
		rollNo = "123456987";
	}*/

	public static void main(String[] args) {
		Employee mEmployee1 = new Employee("123","Mohan","52132");
		Employee mEmployee2 = new Employee("321","Sohan","21456");
		
		mEmployee1.showData();
		mEmployee2.showData();
		
	}

}
