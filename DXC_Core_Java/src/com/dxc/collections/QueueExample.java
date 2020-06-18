package com.dxc.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

// Queue interface uses First in First Out Order

// PriorityQueue Does not Store null values and hold the elements
// or objects to be processed by their priority

public class QueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> mPriorityQueue = new PriorityQueue<String>();
		mPriorityQueue.add("Rohan");
		mPriorityQueue.add("Sohan");
		mPriorityQueue.add("Ram");
		mPriorityQueue.add("Sham");
		
		Iterator mIterator = mPriorityQueue.iterator();
		while(mIterator.hasNext())
			System.out.println(mIterator.next());
		
		mPriorityQueue.remove();
		System.out.println("--------==========-----------");
		Iterator mIterator1 = mPriorityQueue.iterator();
		while(mIterator1.hasNext())
			System.out.println(mIterator1.next());
		
	}
}
