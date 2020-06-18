package com.dxc.collections;

import java.util.ArrayList;
import java.util.Iterator;


// ArrayList Class implements List Interface. It can save Duplicate Elements of Different Data Types. It maintains
// the insertion order and is non-synchronized.

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String>  mList = new ArrayList<String>();
		mList.add("Rohan");
		mList.add("Mohan");
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
