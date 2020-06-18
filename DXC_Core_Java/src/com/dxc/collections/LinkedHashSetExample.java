package com.dxc.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

// LinkedHashet extends Hashset class and implements set interface, like Hashset it also contains unique values and
// it maintains the insertion order and permits null elements

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> mLHSet = new LinkedHashSet<String>();
		mLHSet.add("Sachin");
		mLHSet.add("Sehwag");
		mLHSet.add("Sachin");
		mLHSet.add("Sehwag");
		mLHSet.add("Rohit");
		mLHSet.add("Shikhar");
		mLHSet.add("Virat");
		
		Iterator<String> mIterator = mLHSet.iterator();
		while(mIterator.hasNext())
			System.out.println(mIterator.next());
	}

}
