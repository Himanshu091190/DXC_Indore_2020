package com.dxc.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/************************  Filter Collection Data in Lambda Expression  **************************/
/*class MyPrinters {
	int id;
	String name;
	float price;
	public MyPrinters(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class StreamApiExamples {
	public static void main(String[] args) {
		// ArrayList Created of Type Printers Objects
		List<MyPrinters> mList = new ArrayList<MyPrinters>();
		
		mList.add(new MyPrinters(1, "Hp LaserJet", 17000f));
		mList.add(new MyPrinters(3, "KeyInkJet", 65000f));
		mList.add(new MyPrinters(2, "DryInkjet", 25000f));
		mList.add(new MyPrinters(4, "Dell Printer", 15000f));
		mList.add(new MyPrinters(5, "Dell Laser Jet", 35000f));
		mList.add(new MyPrinters(6, "Samsung InkJet", 5000f));
		
		System.out.println("Filtering the Data \n");
		
//		Stream<Printers> filtered_data_printers = mList.stream().filter(p->p.price>20000);
//		filtered_data_printers.forEach(printer-> System.out.println(printer.name+":"+printer.price));
		
		List<Float> mList1 = 
		mList.stream().filter(p->p.price>20000).// This is used to create a stream with filter
		map(p->p.price). // This map function is used to pull actual data from the filtered stream
		collect(Collectors.toList()); //Collectors.toList is used to save the pulled data from map in form of list 
		System.out.println(mList1);
	}
}*/


/************************** Java Stream Api with Iteration ****************************************/
/*public class StreamApiExamples {
	public static void main(String[] args) {
		Stream.iterate(1, element->element+1).
		filter(element-> element%5==0).
		limit(5).
		forEach(System.out::println);
	}
}*/

/************************** Sum using Collector Methods ****************************************/
/*class MyPrinters {
int id;
String name;
float price;
public MyPrinters(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
}
public class StreamApiExamples {
public static void main(String[] args) {
	// ArrayList Created of Type Printers Objects
	List<MyPrinters> mList = new ArrayList<MyPrinters>();
	
	mList.add(new MyPrinters(1, "Hp LaserJet", 17000f));
	mList.add(new MyPrinters(3, "KeyInkJet", 65000f));
	mList.add(new MyPrinters(2, "DryInkjet", 25000f));
	mList.add(new MyPrinters(4, "Dell Printer", 15000f));
	mList.add(new MyPrinters(5, "Dell Laser Jet", 35000f));
	mList.add(new MyPrinters(6, "Samsung InkJet", 5000f));
	
	System.out.println("Sum the Data Using Collectors Method \n");
		double totalprice = mList.stream().collect(Collectors.summingDouble(p->p.price));
		System.out.println(totalprice);
}
}*/

/************************** Finding the MAX and MIN Printer Price ****************************************/
/*class MyPrinters {
int id;
String name;
float price;
public MyPrinters(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
}
public class StreamApiExamples {
public static void main(String[] args) {
	// ArrayList Created of Type Printers Objects
	List<MyPrinters> mList = new ArrayList<MyPrinters>();
	
	mList.add(new MyPrinters(1, "Hp LaserJet", 17000f));
	mList.add(new MyPrinters(3, "KeyInkJet", 65000f));
	mList.add(new MyPrinters(2, "DryInkjet", 25000f));
	mList.add(new MyPrinters(4, "Dell Printer", 15000f));
	mList.add(new MyPrinters(5, "Dell Laser Jet", 35000f));
	mList.add(new MyPrinters(6, "Samsung InkJet", 5000f));
	
	// max() method to get Max Price of Printer
	MyPrinters mp = mList.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
	System.out.println(mp.price);
	
	// min() method to get Min Price of Printer
	MyPrinters mp1 = mList.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
	System.out.println(mp1.price);
}
}*/

/************************** Count() Method in Collectors ****************************************/
/*class MyPrinters {
int id;
String name;
float price;
public MyPrinters(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
}
public class StreamApiExamples {
public static void main(String[] args) {
	// ArrayList Created of Type Printers Objects
	List<MyPrinters> mList = new ArrayList<MyPrinters>();
	
	mList.add(new MyPrinters(1, "Hp LaserJet", 17000f));
	mList.add(new MyPrinters(3, "KeyInkJet", 65000f));
	mList.add(new MyPrinters(2, "DryInkjet", 25000f));
	mList.add(new MyPrinters(4, "Dell Printer", 15000f));
	mList.add(new MyPrinters(5, "Dell Laser Jet", 35000f));
	mList.add(new MyPrinters(6, "Samsung InkJet", 5000f));
	
	int count = (int) mList.stream().filter(p->p.price<35000).count();
	System.out.println(count);
}
}*/

/************************** Convert List into Set ****************************************/
/*class MyPrinters {
int id;
String name;
float price;
public MyPrinters(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
}
public class StreamApiExamples {
public static void main(String[] args) {
	// ArrayList Created of Type Printers Objects
	List<MyPrinters> mList = new ArrayList<MyPrinters>();
	
	mList.add(new MyPrinters(1, "Hp LaserJet", 17000f));
	mList.add(new MyPrinters(3, "KeyInkJet", 65000f));
	mList.add(new MyPrinters(2, "DryInkjet", 25000f));
	mList.add(new MyPrinters(4, "Dell Printer", 15000f));
	mList.add(new MyPrinters(5, "Dell Laser Jet", 35000f));
	mList.add(new MyPrinters(6, "Samsung InkJet", 5000f));
	
	Set<Float> printerPriceList = 
			mList.stream()
			.filter(p->p.price<35000)
			.map(p->p.price)
			.collect(Collectors.toSet());
	System.out.println(printerPriceList);
}
}*/


/************************** Convert List into Map ****************************************/
/*class MyPrinters {
int id;
String name;
float price;
public MyPrinters(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
}
public class StreamApiExamples {
public static void main(String[] args) {
	// ArrayList Created of Type Printers Objects
	List<MyPrinters> mList = new ArrayList<MyPrinters>();
	
	mList.add(new MyPrinters(1, "Hp LaserJet", 17000f));
	mList.add(new MyPrinters(3, "KeyInkJet", 65000f));
	mList.add(new MyPrinters(2, "DryInkjet", 25000f));
	mList.add(new MyPrinters(4, "Dell Printer", 15000f));
	mList.add(new MyPrinters(5, "Dell Laser Jet", 35000f));
	mList.add(new MyPrinters(6, "Samsung InkJet", 5000f));
	
	Map<Integer,String> printerPriceMap = 
			mList.stream()
			.collect(Collectors.toMap(p->p.id,p->p.name));
	System.out.println(printerPriceMap);
}
}*/


/************************** Method Reference in Collectors ****************************************/
class MyPrinters {

int id;
String name;
float price;

public MyPrinters(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}

public int getId() {
	return id;
}
public String getName() {
	return name;
}
public float getPrice() {
	return price;
}
}
public class StreamApiExamples {
public static void main(String[] args) {
	// ArrayList Created of Type Printers Objects
	List<MyPrinters> mList = new ArrayList<MyPrinters>();
	
	mList.add(new MyPrinters(1, "Hp LaserJet", 17000f));
	mList.add(new MyPrinters(3, "KeyInkJet", 65000f));
	mList.add(new MyPrinters(2, "DryInkjet", 25000f));
	mList.add(new MyPrinters(4, "Dell Printer", 15000f));
	mList.add(new MyPrinters(5, "Dell Laser Jet", 35000f));
	mList.add(new MyPrinters(6, "Samsung InkJet", 5000f));
	
	List<Float> printerPriceList = 
			mList.stream()
			.filter(p->p.price<35000)
			.map(MyPrinters::getPrice)
			.collect(Collectors.toList());
	
	System.out.println(printerPriceList);
}
}