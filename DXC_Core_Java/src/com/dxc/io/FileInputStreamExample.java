package com.dxc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// FileInputStream Class accepts bytes format data from a file. It is used to read byte data in format of image,
// audio, video etc


// Reading Single Character from File
/*public class FileInputStreamExample {
	
	public static void main(String[] args) {
		try {
			FileInputStream mFis = new FileInputStream("F:\\java_files\\myfile.txt");
			int i = mFis.read();
			System.out.println((char) i);
			mFis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}*/

/*****************************  Reading all character byte by byte from file  *******************************/
public class FileInputStreamExample {
	
	public static void main(String[] args) {
		try {
			FileInputStream mFis = new FileInputStream("F:\\java_files\\stringfile.txt");
			int i=0; // we are declaring a counter variable
			while((i = mFis.read()) != -1) // mFis.read() function will return int value of total characters in file
				System.out.print((char) i); // converting the returned ascii value code to character
			mFis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
