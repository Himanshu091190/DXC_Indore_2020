package com.dxc.collections;

import java.util.HashSet;
import java.util.Iterator;

// Set interface saves data in unordered format and doesnt store
// duplicate values and atmost one null value is saved in set


// Hashset implements set interface and saves unique values
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> mHashSet = new HashSet<String>();
		mHashSet.add("Sachin");
		mHashSet.add("Sehwag");
		mHashSet.add("Sachin");
		mHashSet.add("Sehwag");
		mHashSet.add("Rohit");
		mHashSet.add("Shikhar");
		mHashSet.add("Virat");
		
		Iterator mIterator = mHashSet.iterator();
		while(mIterator.hasNext())
			System.out.println(mIterator.next());
	}

}
