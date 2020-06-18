package com.dxc.exceptions;

// Try - Catch Block Implementation

/*public class ExceptionExample {
	public static void main(String[] args) {
		try {
			int marks = 100/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Out of Exception block for execution");
	}
}*/


/*******************  Multiple Catch Block Implementation  *****************************/
/*public class ExceptionExample {
	public static void main(String[] args) {
		try {
			int marks[] = new int[5];
			marks[0] = 95;
			marks[1] = 73;
			marks[2] = 45;
			marks[3] = 85;
			marks[4] = 99;
			
			System.out.println(marks[5]);
			marks[4] = marks[4]/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exeption out of Bounds "+e);
		}
		catch(Exception e) {
			System.out.println("Parent Exception "+e);
		}
		System.out.println("Out of Exception block for execution");
	}
}*/

/****************************  Nested Try Block Implementation  **************************************/
/*public class ExceptionExample {
	public static void main(String[] args) {
		try {
			try {
				int marks[] = new int[5];
				marks[0] = 95;
				marks[1] = 73;
				marks[2] = 45;
				marks[3] = 85;
				marks[4] = 99;
				
				System.out.println(marks[7]);
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception "+e);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Exeption out of Bounds "+e);
			}
			System.out.println("Out of inner Try Exception block for execution");
		}
		catch(Exception e) {
			System.out.println("Parent Exception "+e);
		}
		System.out.println("Out of Exception block for execution");
	}
}*/

/***********************************  Finally Block Implementation  ***************************************/
/*public class ExceptionExample {
	public static void main(String[] args) {
		try {
			try {
				int marks[] = new int[5];
				marks[0] = 95;
				marks[1] = 73;
				marks[2] = 45;
				marks[3] = 85;
				marks[4] = 99;
				
				System.out.println(marks[7]);
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception "+e);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Exeption out of Bounds "+e);
			}
			finally {
				System.out.println("Inside inner Finally Block");
			}
			System.out.println("Out of inner Try Exception block for execution");
		}
		catch(Exception e) {
			System.out.println("Parent Exception "+e);
		}
		finally {
			System.out.println("Inside outer Finally Block");
		}
		System.out.println("Out of Exception block for execution");
	}
}*/


/********************************  Throws Exception Implementation  ****************************************/
/*public class ExceptionExample {
	public static void main(String[] args) throws Exception {
		int marks[] = new int[5];
		marks[0] = 95;
		marks[1] = 73;
		marks[2] = 45;
		marks[3] = 85;
		marks[4] = 99;
		
		System.out.println(marks[7]);
	}
}*/

/*****************  Custom Exception Example and throw keyword Implementation  ***********************/
/*public class ExceptionExample {
	
	static void grade(int totalMarks) {
		if(totalMarks > 450)
			System.out.println("Grade A");
		else if(totalMarks > 400 && totalMarks < 450)
			System.out.println("Grade B");
		else if(totalMarks > 350 && totalMarks < 400)
			System.out.println("Grade C");
		else if(totalMarks > 300 && totalMarks < 350)
			System.out.println("Grade D");
		else if(totalMarks > 250 && totalMarks < 300)
			System.out.println("Grade E");
		else
			throw new ArithmeticException("Your child is Fail for the Season !!   Good Luck next Time");
	}
	
	public static void main(String[] args) throws Exception {
		grade(270);
		grade(310);
		grade(370);
		grade(410);
		grade(470);
		grade(100);
	}
}*/

/****************************  Exception Propagation Implementation  ***************************************/
public class ExceptionExample {
	
	// result function call exception will be given to showGrade Function and showGrade Function will give that 
	// exception to finalResult function where the Exception is being Handled and when finalResult function is 
	// called inside main function it handles the exception and inform the programmer for the same
	
	void result() {
		int totalMarks = 400/0; // Exception is created in this line of code but not handled
	}
	
	void showGrade() {
		result();
	}
	
	void finalResult() {
		try {
			showGrade();
		}
		catch(Exception e) {
			System.out.println("Exception Handled and it is: "+e);
		}
	}
	public static void main(String[] args){
		ExceptionExample mObject = new ExceptionExample();
		mObject.finalResult();
		System.out.println("Out of All Exceptions and now normally flowing");
	}
}