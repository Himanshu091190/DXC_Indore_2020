package com.dxc.collections;

import java.util.Iterator;
import java.util.Stack;

// Stack is a subclass of vector. It implements the last in first out data structure. It provides the methods 
// like push and pop

public class StackExample {

	public static void main(String[] args) {
		Stack<String> mStack = new Stack<String>();
		mStack.push("Ajay");
		mStack.push("Sanjay");
		mStack.push("Mohan");
		mStack.push("Sohan");
		mStack.push("Sumit");
		
		
		Iterator<String> mIterator = mStack.iterator();
		while(mIterator.hasNext())
			System.out.println(mIterator.next());
		
		mStack.pop();
		
		Iterator<String> mIterator1 = mStack.iterator();
		while(mIterator1.hasNext())
			System.out.println(mIterator1.next());
		
	}
}
