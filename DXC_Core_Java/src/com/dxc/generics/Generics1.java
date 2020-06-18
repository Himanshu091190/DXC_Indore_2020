package com.dxc.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class Generics1 {
//
//	public static void main(String[] args) {
//		ArrayList<String> mList = new ArrayList<String>();
//		mList.add("Rohan");
//		mList.add("Sohan");
////		mList.add(50);
//		
//		String s = mList.get(1); // type casting is required here
//		System.out.println(s);
//		
//	}

/******************** Generic Class Implementation  ***************************************/
/*class MyGenerics1<T> {
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	
	T getType() {
		return obj;
	}
}

class Generics1 {
	public static void main(String[] args) {
		MyGenerics1<Integer> mObject = new MyGenerics1<Integer>();
		mObject.add(50);
		System.out.println(mObject.getType());
	}
}*/

/********************************* Generic Method Implementation  ***************************************/
/*class Generics1 {
	
	public static <E> void showArray(E[] elements) {
	for(E element: elements)
		System.out.print(element);
	System.out.println("");
	}
	
	public static void main(String[] args) {
		Integer[] intarray = {10,20,30,40,50};
		Character[] chararray = {'a','b','c','d','e','f','g','h','i','j'};
		String[] stringarray = {"ram","sham","mohan","sohan","sita","geeta","ravi","shiva","vainkata","tirumala"};
		
		System.out.println("Printing Integers");
		showArray(intarray);
		
		System.out.println("Printing Characters");
		showArray(chararray);
		
		System.out.println("Printing Strings");
		showArray(stringarray);
	}
}*/

/*************************** WildCard Implementation in Generics  *************************************/
// ? (Question mark symbol) represents the wildcard element. If we write like <? extends Number, it means that
// any child class of Number i.e Integer,Float,Double. We can call the method of Number class through andy child
// class object

abstract class Bottle {
	abstract void type();
}

class Milk extends Bottle {
	@Override
	void type() {
		System.out.println("Milk Bottle");
	}
}

class Water extends Bottle {
	@Override
	void type() {
		System.out.println("Water Bottle");
	}
}

class Juice extends Bottle {
	@Override
	void type() {
		System.out.println("Juice Bottle");
	}
}

class Generics1 {
	public static void showBottleTypes(List<? extends Bottle> lists) {
		for(Bottle mBottle : lists)
			mBottle.type();
	}
	
	public static void displayListData(List<?> list, String message) {
		System.out.println(message);
		for(Object mObject: list)
			System.out.println(mObject);
	}
	
	public static void main(String[] args) {
		List<Milk> mMilk = new ArrayList<Milk>();
		mMilk.add(new Milk());
		
		List<Water> mWater = new ArrayList<Water>();
		mWater.add(new Water());
		
		List<Juice> mJuice = new ArrayList<Juice>();
		mJuice.add(new Juice());
		
		
		showBottleTypes(mMilk);
		showBottleTypes(mWater);
		showBottleTypes(mJuice);
		
		List<Integer> mListInteger = Arrays.asList(10,20,30,40,50);
		List<String> mListString = Arrays.asList("Ten","Twenty","Thirty","Forty","Fifty");
		displayListData(mListInteger, "Printing Integer Data");
		displayListData(mListString, "Printing String Data");
	}
}