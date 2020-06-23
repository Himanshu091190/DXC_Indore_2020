package com.dxc.creationaldesignpatterns;

public class SingletonExample {
	
	String name;
	public void getInstance() {
		if(name == null) {
			name = new String("Ram");	
			System.out.println(name);
		}
		else
			System.out.println("Name is not null and its value is "+name);
	}
	public static void main(String[] args) {
		SingletonExample mExample = new SingletonExample();
		mExample.getInstance();
	}
}
