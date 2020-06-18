package com.dxc.oops;

public class SecondClass {
// Static Approach
	/*
	 * static int i = 6;
	 * 
	 * static void showMessage() { System.out.println("Hi Java"); }
	 * 
	 * public static void main(String[] args) { System.out.println(i);
	 * showMessage(); }
	 */

	
	// Non Static Approach with Use of Object
	int i = 6;
	void showMessage() {
		System.out.println("Hi Java");
	}

	public static void main(String[] args) {
		SecondClass mObject = new SecondClass(); // Creating Object with new operator
		System.out.println(mObject.i);
		mObject.showMessage();
	}
}
