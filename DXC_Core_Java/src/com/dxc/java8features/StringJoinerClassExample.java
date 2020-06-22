package com.dxc.java8features;

import java.util.StringJoiner;

// StringJoiner class is used to create Sequence of Strings using delimiter
public class StringJoinerClassExample {

	public static void main(String[] args) {

		StringJoiner joinData = new StringJoiner(",");
//		StringJoiner joinData = new StringJoiner(",","[","]"); // Adding suffix and Prefix
		
		joinData.add("Sachin");
		joinData.add("Sehwag");
		joinData.add("Virat");
		joinData.add("Rohit");
		joinData.add("Dhoni");

		System.out.println(joinData);
	}
}
