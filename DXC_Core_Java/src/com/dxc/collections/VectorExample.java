package com.dxc.collections;

import java.util.Iterator;
import java.util.Vector;

// Vector is similar to ArrayList it is synchronized
public class VectorExample {

	public static void main(String[] args) {
		Vector<String> mVector = new Vector<String>();
		mVector.add("Rohan");
		mVector.add("Mohan");
		mVector.add("Shankar");
		mVector.add("Rajeev");
		
		
		// iterator: It is used to navigate in the collection and it can maintain the status of the collection i.e
		// whether it has more values or not, whether the value exists at some position or not and we can directly
		// jump to any position we want and while navigating we dont need to specify starting and end point in 
		// iterator likewise in loops
		
		// Traversing the Vector using iterator
		Iterator mIterator = mVector.iterator();
		while(mIterator.hasNext())
			System.out.println(mIterator.next());
	}

}
