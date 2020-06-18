package com.dxc.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

// DataInputStream Class allows program to read primitive data from the input Stream

public class DataInputStreamExample {

	public static void main(String[] args) throws Exception {
		InputStream mIs = new FileInputStream("F:\\java_files\\testout.txt");
		DataInputStream mDis = new DataInputStream(mIs);
		int count = mIs.available();
		byte[] array = new byte[count];
		mDis.read(array);
		for(byte bt: array)
			System.out.println((char) bt);
	}

}
