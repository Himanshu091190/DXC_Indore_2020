package com.dxc.collections;

import java.util.Iterator;
import java.util.LinkedList;

// LinkedList implements Collection Interface. It saves Duplicate Entries and insertion order is maintained and it 
// is not synchronized. It is fast in execution because no shifting is required

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> mList = new LinkedList<String> ();
		mList.add("Rohan");
		mList.add("Rohan");
		mList.add("Shankar");
		mList.add("Rajeev");
		
		
		// iterator: It is used to navigate in the collection and it can maintain the status of the collection i.e
		// whether it has more values or not, whether the value exists at some position or not and we can directly
		// jump to any position we want and while navigating we dont need to specify starting and end point in 
		// iterator likewise in loops
		
		// Traversing the List using iterator
		Iterator mIterator = mList.iterator();
		while(mIterator.hasNext())
			System.out.println(mIterator.next());
	}
}
