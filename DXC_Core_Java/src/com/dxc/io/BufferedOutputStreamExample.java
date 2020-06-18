package com.dxc.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// BufferedOutputStream Class is used for buffering output Stream

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream mFout = new FileOutputStream("F:\\java_files\\outputfile.txt");
			BufferedOutputStream mBout = new BufferedOutputStream(mFout);
			String message = "Hi Output classes how are you all ?";
			byte b[] = message.getBytes();
			mBout.write(b);
			mBout.flush(); // it flushes out all the things from stream so that no garbage is left, its like clear
			mBout.close();
			mFout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
