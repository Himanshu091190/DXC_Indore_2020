package com.dxc.io;

import java.io.PipedReader;
import java.io.PipedWriter;

// PipeReader PipeWriter are generally used for writing text and are used by different threads

public class PipeReaderWriterExample {

	public static void main(String[] args) throws Exception {
		PipedReader reader = new PipedReader();
		PipedWriter writer = new PipedWriter(reader);
		
		Thread readerThread = new Thread(new Runnable() {
			public void run() {
			try {
				int data = reader.read();
				while(data != -1) {
					System.out.print((char) data);
					data = reader.read();
				}
			}
			catch(Exception e) {
				System.out.println("Exception is "+e);
			}
			}
		});
		
		Thread writerThread = new Thread(new Runnable() {
			public void run() {
			try {
				writer.write("I am a new Learner of Java in the Company\n".toCharArray());
			}
			catch(Exception e) {
				System.out.println("Exception is "+e);
			}
			}
		});
		
		readerThread.start();
		writerThread.start();
	}

}
