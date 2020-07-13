package com.dxc.springcore.collectionsci;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	int id;
	String name;
	List<String> answers;
	Map<String, String> mMap;

	public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public Question(int id, String name, Map<String, String> mMap) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
		this.mMap = mMap;
	}

	public void displayInfo() {
		System.out.println("ID: " + id + ", Name: " + name + "\nAnswers are:");
//		Iterator<String> itr = answers.iterator();
//		while (itr.hasNext())
//			System.out.println(itr.next());
		
		Set<Entry<String,String>> set = mMap.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry = itr.next();
			System.out.println("Answer is "+entry.getKey()+", Posted By: "+entry.getValue());
		}
	}
}
