package com.dxc.java8features;

// Method Reference is used to refer method of functional interface
// 1. Reference to a static method
// 2. Reference to an instance method
// 3. Reference to a constructor


/*// 1. Reference to Static Method
interface College {
	void course();
}

public class MethodReferenceExample {
	
	public static void myCollegeCourse() {
		System.out.println("I am doing B.Tech in IT");
	}
	
	public static void main(String[] args) {
	// We are passing the class method reference to interface method
		College mCollege = MethodReferenceExample::myCollegeCourse;
		mCollege.course();
	}
}
*/

/*//2. Reference to Instance Method
interface College {
	void course();
}

public class MethodReferenceExample {
	
	public void myCollegeCourse() {
		System.out.println("I am doing B.Tech in IT");
	}
	
	public static void main(String[] args) {
		MethodReferenceExample mObject = new MethodReferenceExample();
		College mCollege = mObject::myCollegeCourse;
		mCollege.course();
	}
}
*/

//3. Reference to a Constructor
interface College {
	University getMessage(String msg);
}

class University {
	University(String msg) {
		System.out.println(msg);
	}
}
public class MethodReferenceExample {
	
	public static void main(String[] args) {
		College mCollege = University::new;
		mCollege.getMessage("University is Bharati Vidyapeeth University, Pune");
	}
}
