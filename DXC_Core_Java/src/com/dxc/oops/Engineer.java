package com.dxc.oops;
// Single Inheritance
class BtechEmployee {
	float salary = 50000;
	
	void showSalary() {
		System.out.println(salary);
	}
}

public class Engineer extends BtechEmployee {
	int annualBonus = 20000;
	public static void main(String[] args) {
		Engineer mEngineer = new Engineer();
		System.out.println("Engineer Salary "+mEngineer.salary);
		mEngineer.showSalary();
		System.out.println("Engineer Bonus "+mEngineer.annualBonus);
	}

}
