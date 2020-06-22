package com.dxc.java8features;

import java.util.Base64;

public class Base64EncoderExample {

	public static void main(String[] args) {
		
		/********** Byte Data Getting Encoded   ********************/
		/*// Getting the Encoder from Java
		Base64.Encoder encoder = Base64.getEncoder();
		// Creating Byte Array
		byte byteArray[] = {1,2};
		// Encoding byte array
		byte byteEncArray[] = encoder.encode(byteArray);
		System.out.println("Encoded Byte Array is "+byteEncArray);
		// creating a byte array to track how many number of bytes are encoded
		byte byteArray1[] = new byte[5];
		int counter = encoder.encode(byteArray, byteArray1); // It will return the number of bytes written
		System.out.println("No of bytes written are "+counter);
		*/
		
		/******************* String Data Getting Encoded & Decoded  ***********************/
		/*Base64.Encoder encoder = Base64.getEncoder();
		String strEncode = encoder.encodeToString("DXC Technologies, Indore_Java_FSD,2020".getBytes());
		System.out.println("Endcoded String is "+strEncode);
		
		// Getting Decoder now
		Base64.Decoder decoder = Base64.getDecoder();
		String strDecode = new String(decoder.decode(strEncode));
		System.out.println("Decoded String is "+strDecode);*/
		
		/******************* URL Data Getting Encoded & Decoded  ***********************/
		Base64.Encoder encoder = Base64.getUrlEncoder();
		String strUrlEncode = encoder.encodeToString("https://teams.microsoft.com/_package/go#/pre-join-calling/19:meeting_MjIzMWMxZWUtOWM0OC00YzQyLThhY2ItYWI0Yzg3MWI2MTQz@thread.v2".getBytes());
		System.out.println("Endcoded URL is "+strUrlEncode);
		
		// Getting Decoder now
		Base64.Decoder decoder = Base64.getUrlDecoder();
		String strUrlDecode = new String(decoder.decode(strUrlEncode));
		System.out.println("Decoded URL is "+strUrlDecode);
	}
}
