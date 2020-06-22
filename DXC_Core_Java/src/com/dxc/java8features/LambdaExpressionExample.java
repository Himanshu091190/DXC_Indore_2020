package com.dxc.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

// Lambda Expression is a way to provide clear and concise way to represent one method interface using an 
// parenthesis () expression.

// Lambda expression provides implementation of functional interface. As interface which has only one abstract method
// is called functional interface introduced in java 8 and above

// why to use Lambda Expression
// a. To provide the implementation of functional interface
// b. Less coding is done

// Syntax of Lambda Expression is (argument-list) -> (body)
// a. argument-list: It can be empty or non-empty as well
// b. arrow-token: It is used to link arguments-list and body of expression
// c. body: It contains expressions and body for lambda expression.

/*// Functional interface Screen
interface Screen {
	public void screenType();
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		String screenType="LED Screen 32'";
		
		//with Lambda Expression
		Screen type = () -> {
			System.out.println("Screen Type is "+screenType);
		};
		type.screenType();
	}
}*/


/******************** No Parameter Lambda Expression Example ************************************/
/*//Functional interface Screen
interface Screen {
	public String screenType();
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		String screenType="LED Screen 32'";
		
		//with Lambda Expression
		Screen type = () -> {
			return "Screen Type is "+screenType;
		};
		System.out.println(type.screenType());
	}
}*/

/******************** Single Parameter Lambda Expression Example ************************************/
/*//Functional interface Screen
interface Screen {
	// function with one parameter
	public String screenType(String localvariable);
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		String screenType="LED Screen 32'";
		
		//with Lambda Expression: here(typeofscreen) represents the method of the interface
		Screen type = (typeofscreen) -> {
			return "Screen Type is "+screenType;
		};
		System.out.println(type.screenType(screenType));
	}
}*/

/******************** Multiple Parameter Lambda Expression Example ************************************/
/*//Functional interface Screen
interface Screen {
	// function with one parameter
	public String screenType(String localvariable, String price);
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		String screenType="LED Screen 32'", priceofScreen = "INR 8,500/-";
		
		//with Lambda Expression: here(typeofscreen) represents the method of the interface
		Screen type = (scType, price) -> {
			return "Screen Type is "+scType+"\nPrice is "+price;
		};
		System.out.println(type.screenType(screenType, priceofScreen));
	}
}
*/

/******************** For Each Loop Lambda Expression Example ************************************/
/*public class LambdaExpressionExample {
	public static void main(String[] args) {
		List<String> mList = new ArrayList<String>();
		mList.add("Full Smart");
		mList.add("Full HD");
		mList.add("Full Smart Full HD");
		mList.add("Full Smart Full HD with 3D Picture Quality");
		
//		Iterator<String> mIterator = mList.iterator();
//		while(mIterator.hasNext())
//			System.out.println(mIterator.next());
		
		mList.forEach(
				(str)->System.out.println(str)
				);
	}
}*/

/*********************** Thread Creation in Lambda Expression  ********************************/
/*public class LambdaExpressionExample {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1 is Running");
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 2 is Running");
			}
		};
		
		Thread t2 = new Thread(r2);
		t2.start();
	}
}*/

/************************  Comparator in Lambda Expression  **************************/
/*class Printers {
	int id;
	String name;
	float price;
	public Printers(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class LambdaExpressionExample {
	public static void main(String[] args) {
		// ArrayList Created of Type Printers Objects
		List<Printers> mList = new ArrayList<Printers>();
		
		mList.add(new Printers(1, "Hp LaserJet", 25000f));
		mList.add(new Printers(3, "KeyInkJet", 15000f));
		mList.add(new Printers(2, "DryInkjet", 5000f));
		mList.add(new Printers(4, "DryInkjet", 15000f));
		
		System.out.println("Sorting the Data on the basis of product name");
		
		// implementing Lambda Expressions
		Collections.sort(mList,(p1,p2)-> {
			return p1.name.compareTo(p2.name);
		});
		for(Printers p: mList) {
			System.out.println(p.id+", "+p.name+", "+p.price);
		}
	}
}*/

/************************  Filter Collection Data in Lambda Expression  **************************/
class Printers {
	int id;
	String name;
	float price;
	public Printers(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class LambdaExpressionExample {
	public static void main(String[] args) {
		// ArrayList Created of Type Printers Objects
		List<Printers> mList = new ArrayList<Printers>();
		
		mList.add(new Printers(1, "Hp LaserJet", 17000f));
		mList.add(new Printers(3, "KeyInkJet", 65000f));
		mList.add(new Printers(2, "DryInkjet", 25000f));
		mList.add(new Printers(4, "Dell Printer", 15000f));
		mList.add(new Printers(5, "Dell Laser Jet", 35000f));
		mList.add(new Printers(6, "Samsung InkJet", 5000f));
		
		System.out.println("Filtering the Data \n");
		
		Stream<Printers> filtered_data_printers = mList.stream().filter(p->p.price>20000);
		filtered_data_printers.forEach(printer-> System.out.println(printer.name+":"+printer.price));
	}
}