package com.dxc.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

// ByteArrayOutputStream class is used to write Common data into multiple files

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream mFout1 = new FileOutputStream("F:\\java_files\\file1.txt");
		FileOutputStream mFout2 = new FileOutputStream("F:\\java_files\\file2.txt");

		ByteArrayOutputStream mBouts = new ByteArrayOutputStream();
		mBouts.write(100);
		mBouts.writeTo(mFout1);
		mBouts.writeTo(mFout2);
		
		mBouts.flush();
		mFout1.close();
		mFout2.close();
		System.out.println("Written Data Successfully in Files");
	}

}
