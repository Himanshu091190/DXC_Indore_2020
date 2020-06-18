package com.dxc.io;

import java.io.FileReader;

// FileReader is a class used to read data from file, it is characted oriented class

public class FileReaderExample {

	public static void main(String[] args) throws Exception{

		FileReader mFr = new FileReader("F:\\java_files\\myfile.txt");
		int i;
		while((i = mFr.read()) != -1)
			System.out.print((char) i);
		mFr.close();
	}
}
