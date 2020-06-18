package com.dxc.oops;

// Abstract class is a class which is declared with abstract keyword
// It can have abstract or non-abstract methods(method with body)

// abstract class having constructor, data member and methods
abstract class Sanitizer {
	
	public Sanitizer() {
		System.out.println("Sanitizer is created and will be utilized now");
	}
	abstract void sanitize();
	void createSanitizer() {
		System.out.println("Sanitizer creation for various types has been started now");
	}
}

class HandSanitizer extends Sanitizer {
	@Override
	void sanitize() {
		System.out.println("We are Providing Hand Sanitizer Service in City");
	}
}

class VehicleSanitizer extends Sanitizer {
	@Override
	void sanitize() {
		System.out.println("We are Providing Vehicle Sanitizer Service in City");
	}
}

class HomeSanitizer  extends Sanitizer {
	@Override
	void sanitize() {
		System.out.println("We are Providing Home Sanitizer Service in City");
	}
}

public class AbstractClassExample  {

	public static void main(String[] args) {
		Sanitizer mObject;
		mObject = new HandSanitizer();
		mObject.sanitize();
		mObject.createSanitizer();
		
		mObject = new VehicleSanitizer();
		mObject.sanitize();
		mObject.createSanitizer();
		
		mObject = new HomeSanitizer();
		mObject.sanitize();
		mObject.createSanitizer();
	}


}
