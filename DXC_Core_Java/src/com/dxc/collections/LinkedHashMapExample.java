package com.dxc.collections;

import java.util.LinkedHashMap;
import java.util.Map;

// LinkedHashMap implements Map interface and It maintains order of insertion and allows one null key and multiple
// null values

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> mLHMap = new LinkedHashMap<Integer, String>();
		mLHMap.put(101, "Sachin");
		mLHMap.put(102, "Virat");
		mLHMap.put(103, "Rohit");
		mLHMap.put(104, "Shikhar");
		mLHMap.put(105, "Sehwag");
		
		for(Map.Entry mEntry: mLHMap.entrySet())
			System.out.println("Key: "+mEntry.getKey()+", Value: "+mEntry.getValue());
	}

}
