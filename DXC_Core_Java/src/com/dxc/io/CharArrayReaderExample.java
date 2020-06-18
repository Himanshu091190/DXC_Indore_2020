package com.dxc.io;

import java.io.CharArrayReader;

//  CharArrayReader class is used to read character array as reader(Stream)

public class CharArrayReaderExample {

	public static void main(String[] args) throws Exception{
		char[] array = {'h','i','m','a','n','s','h','u'};
		CharArrayReader mReader = new CharArrayReader(array);
		int k=0;
		
		while((k = mReader.read()) != -1)
			System.out.println((char) k);
	}

}
