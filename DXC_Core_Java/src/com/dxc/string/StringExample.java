package com.dxc.string;

public class StringExample {

	public static void main(String[] args) {
		String a = "rohan"; // 123 reference id is created and assigned to reference variable a by java
		char ch[] = {'r','o','h','a','n'};
		String b = new String(ch);
		String c = new String("rohan");
		String d = "rohan"; // 123 reference id is provided to d vairable by java
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		if(a == b)
			System.out.println("a and b are equal");
		
		if(a == c)
			System.out.println("a and c are equal");
		
		if(a == d)
			System.out.println("a and d are equal");
		
		if(b == c)
			System.out.println("b and c are equal");
		
		if(a.equals(d))
			System.out.println("a and d are equal");
		if(a.equals(b))
			System.out.println("a and b are equal");
		if(a.equals(c))
			System.out.println("a and c are equal");
		if(b.equals(c))
			System.out.println("b and c are equal");
		if(b.equals(d))
			System.out.println("b and d are equal");
	}

}
