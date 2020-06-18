package com.dxc.io;

import java.io.FileWriter;

// FileWriter class is used to write character oriented data

public class FileWriterExample {
	
	public static void main(String[] args) throws Exception{

		FileWriter mFw = new FileWriter("F:\\java_files\\myfile.txt");
		mFw.write("Hello File Writer you are writing something");
		mFw.close();
		System.out.println("File written Successfully");
	}

}
