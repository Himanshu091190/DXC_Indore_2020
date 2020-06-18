package com.dxc.oops;

/*****************Method OverLoading***************************/
/* Implementation of Method Overloading
a. By changing the number of arguments
b. By changing the data Type
*/


/*//a. By changing the number of arguments
class Address {
	void myAddress(String Address) {
		System.out.println(Address);
	}

	void myAddress(String Address, int pincode) {
		System.out.println(Address + pincode);
	}
}*/

/*// b. By changing the data Type
class Address {
	void myAddress(String Address) {
		System.out.println(Address);
	}

	int myAddress(int Address) {
		return Address;
	}
}*/

/*public class PolymorphismExample {
	public static void main(String[] args) {
		Address mAddress = new Address();
		mAddress.myAddress("Delhi");
		System.out.println(mAddress.myAddress(110018));
	}
}
*/



/*****************Method Overriding***************************/

// Implementation of Method Overriding

/*class Motor {
	void city() {
		System.out.println("Vehicle in Delhi");
	}
}

class BikeType extends Motor {
	void city() {
		System.out.println("Bike Vehicle in Delhi");
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		BikeType mBikeType = new BikeType();
		mBikeType.city();
	}
}*/



/*************** COVARIANT RETURN TYPE  *******************/
// Implementation of Covariant Return Type: It specifies that the
// return type may vary in the same direction as subclass

/*class A {
	A getType() {
		return this;
	}
}

class B extends A {
	B getType() {
		return this;
	}
	
	void display() {
		System.out.println("Hello Covariant return Type");
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		new B().getType().display();
	}
}*/


/******************  SUPER IMPEMENTATION  ********************/
/*class Motor {
	void city() {
		System.out.println("Vehicle in Delhi");
	}
}

class BikeType extends Motor {
	void city() {
		super.city();
		System.out.println("Bike Vehicle in Delhi");
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		BikeType mBikeType = new BikeType();
		mBikeType.city();
	}
}*/


/**************  FINAL IMPLEMENTATION  *********************/
// Final is implemented on 3 types
//a. Final Variable: Its value cant be changed
//b. Final Method: Its Definition cant be changed
//c. Final Class: It cant be extended

// Final Variable
/*public class PolymorphismExample {
	final int salary = 1000;
	void bonus() {
		salary = 5000;
	}
	public static void main(String[] args) {
		PolymorphismExample mObject = new PolymorphismExample();
		mObject.bonus();
	}
}*/

// Final Method
/*class Motor {
	final void city() {
		System.out.println("Vehicle in Delhi");
	}
}

class BikeType extends Motor {
	void city() {
		System.out.println("Bike Vehicle in Delhi");
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		BikeType mBikeType = new BikeType();
		mBikeType.city();
	}
}
*/

// Final Class
/*final class Motor{}
class BikeType extends Motor {
	void city() {
		System.out.println("Bike Vehicle in Delhi");
	}
}
public class PolymorphismExample {
	public static void main(String[] args) {
		BikeType mBikeType = new BikeType();
		mBikeType.city();
	}
}*/


/********** Implementation of instanceof Operator  *********/
/*public class PolymorphismExample {
	public static void main(String[] args) {
		PolymorphismExample mObject = new PolymorphismExample();
		System.out.println(mObject instanceof PolymorphismExample);
	}
}*/


/******************* Implementation of Runtime Polymorphism  ************************************/
class Motor{
	void city() {
		System.out.println("Delhi");
	}
}
class BikeType extends Motor {
	void city() {
		System.out.println("Bike Vehicle in Delhi");
	}
}
public class PolymorphismExample {
	public static void main(String[] args) {
		Motor mMotor = new BikeType();
		mMotor.city();
	}
}