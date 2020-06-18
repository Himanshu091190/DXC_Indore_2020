package com.dxc.collections;

import java.util.HashMap;
import java.util.Map;

// Map is a interface which contains values on the basis of key. key and value pair is used in map and Each key and 
// value pair in map is known as Entry. Map doesnt allow duplicate keys, but allows duplicate values

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> mMap = new HashMap<Integer,String>();
		mMap.put(101, "Sachin");
		mMap.put(102, "Virat");
		mMap.put(103, "Rohit");
		mMap.put(104, "Shikhar");
		mMap.put(105, "Sehwag");
		
		// Parsing the Map using for Each Loop
		for(Map.Entry mEntry: mMap.entrySet())
			System.out.println("Key: "+mEntry.getKey()+", Value: "+mEntry.getValue());
	}

}
