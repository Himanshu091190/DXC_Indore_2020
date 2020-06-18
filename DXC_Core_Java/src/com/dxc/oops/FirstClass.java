package com.dxc.oops;

/*
 * 
 This is how we write multiline comment for Java
 * 
 */
public class FirstClass {
	
	int data = 50; // global/instance variable
	// int -> Integer
	// float -> Float
	// byte -> Byte
	// long -> Long
	// double -> Double
	// String -> String
	static int i = 6; // static variable
	
	void method() {
		String mask = "N95"; // local variable
	}
	
	public static void main(String[] args) {
		// If else and if-else-if
		int rollno = 15;
		if(rollno == 5)
			System.out.println("It is A Section");
		else if(rollno == 10)
			System.out.println("It is B Section");
		else 
		System.out.println("It is Science Section");
		
		// Switch Example
		switch(rollno) {
		case 5:	System.out.println("It is A Section from switch"); break;
		case 10: System.out.println("It is B Section from switch"); break;
		case 15: System.out.println("It is Science Section from switch"); break;
		default: System.out.println("Nothing Matched from switch");
		}
		
		// Loops
			//For
		int counter=0;
		for(counter = 0; counter<5; counter++)
			System.out.println("For Counter "+counter);
		
			//While
		counter = 0;
		while(counter <5) {
			System.out.println("While Counter "+counter);
			counter++;
		}
			
			// do while
		counter = 0;
		do {
			System.out.println("Do While Counter "+counter);
			counter++;
		}while(counter<5);
		
		
		// Continue Example
		for(int i=1; i<=10; i++) {
			if(i==5)
				continue;
			System.out.println(i);
		}
	}
}
