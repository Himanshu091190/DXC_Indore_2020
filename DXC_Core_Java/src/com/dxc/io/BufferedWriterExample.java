package com.dxc.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

// BufferedWriter class is used to provide buffering for writer instances

public class BufferedWriterExample {

	public static void main(String[] args) throws Exception {
		FileWriter mFw  = new FileWriter("F:\\java_files\\myfile.txt");
		BufferedWriter mBfw = new BufferedWriter(mFw);
		mBfw.write("Hello Reader Writers i was waiting for you");
		mBfw.close();
		System.out.println("File written successfully");
	}
}
