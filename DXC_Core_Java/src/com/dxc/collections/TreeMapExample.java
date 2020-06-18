package com.dxc.collections;

import java.util.Map;
import java.util.TreeMap;

// Treemap implements Map interface. It cannot have null keys but can have null values and it maintains asc order
// and like wise map it also contains only unique elements
public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> mTreeMap = new TreeMap<Integer,String>();
		mTreeMap.put(101, "Sachin");
		mTreeMap.put(102, "Virat");
		mTreeMap.put(103, "Rohit");
		mTreeMap.put(104, "Shikhar");
		mTreeMap.put(105, "Sehwag");
		
		for(Map.Entry mEntry: mTreeMap.entrySet())
			System.out.println("Key: "+mEntry.getKey()+", Value: "+mEntry.getValue());
	}

}
