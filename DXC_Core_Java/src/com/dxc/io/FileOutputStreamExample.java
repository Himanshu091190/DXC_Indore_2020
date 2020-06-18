package com.dxc.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// FileOutputStream Class is used to write Data in File. We can write primitive values in File, and byte oriented
// and character oriented data can be written in File.


// Writing Data in byte Format
/*public class FileOutputStreamExample {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the Path");
			Scanner mScanner = new Scanner(System.in);
			String mPath = mScanner.next();
//			FileOutputStream mFout = new FileOutputStream("F:\\java_files\\myfile.txt");
			FileOutputStream mFout = new FileOutputStream(mPath);
			mFout.write(100);
			System.out.println("Successfully written in File");
			mFout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}*/



/*********************  Writing Data in String format   ************************************/
public class FileOutputStreamExample {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the Path");
			Scanner mScanner = new Scanner(System.in);
			String mPath = mScanner.next();
			System.out.println("Enter the message to be written in file");
			String message = "hello file handling how are you ?";
			FileOutputStream mFout = new FileOutputStream(mPath);
			byte b[] = message.getBytes();
			mFout.write(b);
			System.out.println("Successfully written in File");
			mFout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}