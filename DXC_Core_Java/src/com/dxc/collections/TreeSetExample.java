package com.dxc.collections;

import java.util.Iterator;
import java.util.TreeSet;

// TreeSet class implements Set interface. It also contains unique values and the values are stored in asc order
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> mTreeSet = new TreeSet<String>();
		mTreeSet.add("Rohit");
		mTreeSet.add("Virat");
		mTreeSet.add("Rohit");
		mTreeSet.add("Ajinkya");
		
		Iterator<String> mIterator = mTreeSet.iterator();
		while(mIterator.hasNext())
			System.out.println(mIterator.next());
	} 
}
