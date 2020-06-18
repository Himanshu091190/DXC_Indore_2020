package com.dxc.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// BufferedReader class is used to read the text from character based input stream

/*public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		FileReader mFR = new FileReader("F:\\java_files\\myfile.txt");
		BufferedReader mBuff = new BufferedReader(mFR);
		
		int i;
		while((i = mBuff.read()) != -1)
			System.out.print((char) i);
		mBuff.close();
		mFR.close();
	}
}*/


/********************* Reading Data from Console ****************************************/
/*public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		InputStreamReader mISR = new InputStreamReader(System.in);
		BufferedReader mBuff = new BufferedReader(mISR);
		
		System.out.println("Enter your Name Please");
		String name = mBuff.readLine();
		System.out.println("Hello "+name+" Honda Motors Welcome you !! How can we help you ?");
	}
}*/


/*********************************** Enter Exit to Terminate the Programe  *****************************/
public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		InputStreamReader mISR = new InputStreamReader(System.in);
		BufferedReader mBuff = new BufferedReader(mISR);
		
		String name="";
		while(!name.equalsIgnoreCase("exit")) {
		System.out.println("Enter your data Please");
		name = mBuff.readLine();
		System.out.println("Hello "+name);
		}
		mBuff.close();
		mISR.close();
	}
}