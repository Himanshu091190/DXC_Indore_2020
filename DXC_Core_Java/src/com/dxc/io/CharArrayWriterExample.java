package com.dxc.io;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

// CharArrayWriter class is used to write common data in multiple files

public class CharArrayWriterExample {

	public static void main(String[] args) throws Exception{
		
		InputStreamReader mISR = new InputStreamReader(System.in);
		BufferedReader mBuff = new BufferedReader(mISR);
		
		FileWriter mFw1 = new FileWriter("F:\\java_files\\file_1.txt");
		FileWriter mFw2 = new FileWriter("F:\\java_files\\file_2.txt");
		FileWriter mFw3 = new FileWriter("F:\\java_files\\file_3.txt");
		
		System.out.println("Enter the content to be written inside file 1");
		String content = mBuff.readLine();
		CharArrayWriter mChW = new CharArrayWriter();
		mChW.write(content);
		mChW.writeTo(mFw1);	
		
		System.out.println("Enter the content to be written inside file 2");
		String content2 = mBuff.readLine();
		CharArrayWriter mChW2 = new CharArrayWriter();
		mChW2.write(content2);
		mChW2.writeTo(mFw2);

		
		System.out.println("Enter the content to be written inside file 3");
		String content3 = mBuff.readLine();
		CharArrayWriter mChW3 = new CharArrayWriter();
		mChW3.write(content3);
		mChW3.writeTo(mFw3);

		
		mFw1.close();			mFw2.close();			mFw3.close();	
	}

}
