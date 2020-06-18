package com.dxc.oops;

// Interface is a blueprint of a class. It has static constants
// and abstract methods


interface HomeSanitizerBD {
	void show();
}

interface HandSanitizerBD {
	void AlcoholType();
}

interface VehicleSanitizerBD {
	void AlcoholQty();
}

public class InterfaceExample implements HomeSanitizerBD, HandSanitizerBD, VehicleSanitizerBD {

	public static void main(String[] args) {
		InterfaceExample mObject = new InterfaceExample();
		mObject.show();
		mObject.AlcoholQty();
		mObject.AlcoholType();
	}

	@Override
	public void show() {
		System.out.println("Hello from Implemented method of interface");
	}

	@Override
	public void AlcoholQty() {
		System.out.println("Hello from alcohol Quantity");
	}

	@Override
	public void AlcoholType() {
		System.out.println("Hello from Alcohol Type");
	}

}
