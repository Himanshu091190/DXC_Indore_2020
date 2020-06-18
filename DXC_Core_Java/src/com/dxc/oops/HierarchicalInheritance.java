package com.dxc.oops;

class Vehicle {
	void city() {
		System.out.println("Vehicle in Delhi");
	}
}

class Car extends Vehicle {
	void VehicleType() {
		System.out.println("It is 4 Wheeler in Delhi");
	}
}

class Bike extends Vehicle {
	void type() {
		System.out.println("It is a 2 Wheeler in Delhi");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Bike mBike = new Bike();
		Car mCar = new Car();
		mBike.type();
		mCar.VehicleType();
		
		mCar.city();
		mBike.city();
	}
}
