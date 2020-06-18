package com.dxc.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

// DataOutputStream Class allows an aplication to write primitive data types to output stream

public class DataOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream mFout = new FileOutputStream("F:\\java_files\\testout.txt");
		DataOutputStream mDouts = new DataOutputStream(mFout);
		mDouts.write(97);
		mDouts.flush();
		mDouts.close();
		System.out.println("Written Successfully");
	}

}
