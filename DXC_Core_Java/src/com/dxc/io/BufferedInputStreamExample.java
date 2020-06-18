package com.dxc.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

// BufferedInputStream class is usedt read information from stream

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		FileInputStream mFis = new FileInputStream("F:\\java_files\\outputfile.txt");
		BufferedInputStream mBis = new BufferedInputStream(mFis);
		int i;
		while((i=mBis.read()) != -1)
			System.out.print((char) i);
		mFis.close();
		mBis.close();
	}
}
