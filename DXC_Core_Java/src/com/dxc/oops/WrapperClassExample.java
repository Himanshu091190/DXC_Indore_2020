package com.dxc.oops;


/****************  PRIMITIVE TO WRAPPER  ********************/
/*// Primitive to Wrapper
// int to Integer
public class WrapperClassExample {

	public static void main(String[] args) {
		int a = 20;
		// converting int to integer manually
		Integer i = Integer.valueOf(a);
		
		// converting int into integer automatically i.e autoboxing
		Integer j = a;
		
		System.out.println(a+", "+i+", "+j);
	}
}*/


/********************* WRAPPER TO PRIMITIVE  *******************/
/*//Wrapper to Primitive
//Integer to int
public class WrapperClassExample {

	public static void main(String[] args) {
		Integer a = new Integer(30);
		
		// convert Integer to int manually
		int i = a.intValue();
		
		// converting integer into int automatically i.e unboxing
		int j = a;
		
		System.out.println(a+", "+i+", "+j);
	}
}
*/

/**************** ALL DATA TYPES CONVERSIONS ******************/
public class WrapperClassExample {

	public static void main(String[] args) {
		byte  b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0F;
		double d = 60.0D;
		char c = 'a';
		boolean b1 = true;
		
		// AutoBoxing
		Byte mByte = b;
		Short mShort = s;
		Integer mInteger = i;
		Long mLong = l;
		Float mFloat = f;
		Double mDouble = d;
		Character mCharacter = c;
		Boolean mBoolean = b1;
		
		System.out.println("Byte Object "+mByte);
		System.out.println("Short Object "+mShort);
		System.out.println("Integer Object "+mInteger);
		System.out.println("Long Object "+mLong);
		System.out.println("Float Object "+mFloat);
		System.out.println("Double Object "+mDouble);
		System.out.println("Character Object "+mCharacter);
		System.out.println("Boolean Object "+mBoolean);
		
		
		// UnBoxing
		byte mbyte = mByte;
		short mshort = mShort;
		int mint = mInteger;
		long mlong = mLong;
		float mfloat = mFloat;
		double mdouble = mDouble;
		char mchar = mCharacter;
		boolean mbool = mBoolean;
		
		System.out.println("byte value "+mbyte);
		System.out.println("short value "+mshort);
		System.out.println("int value "+mint);
		System.out.println("long value "+mlong);
		System.out.println("float value "+mfloat);
		System.out.println("double value "+mdouble);
		System.out.println("character value "+mchar);
		System.out.println("boolean value "+mbool);
		
	}
}