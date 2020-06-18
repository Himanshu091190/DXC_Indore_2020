package com.dxc.io;

import java.io.ByteArrayInputStream;

// ByteArrayInputStream is used t ready byte array as input stream

public class ByteArrayInputStreamExample {

	public static void main(String[] args) {
		byte[] mArr = {97,98,99,100};
		ByteArrayInputStream mBis = new ByteArrayInputStream(mArr);
		
		int i = 0;
		while((i = mBis.read()) != -1)
			System.out.println("Character Value of ASCII is "+(char) i);
	}

}
