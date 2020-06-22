package com.dxc.java8features;

import java.util.Optional;

// It is a public FINAL class use to deal with NullPointerExceptions
public class OptionalClassExample {

	public static void main(String[] args) {

		// NULLPointer Exception will be raised
		/*
		 * String strArray[] = new String[10]; String lowerCaseStr =
		 * strArray[5].toLowerCase(); System.out.println(lowerCaseStr);
		 */

		String strArray[] = new String[10];
		Optional<String> checkNullValue = Optional.ofNullable(strArray[5]);
		if (checkNullValue.isPresent()) {
			String lowerCaseStr = strArray[5].toLowerCase();
			System.out.println(lowerCaseStr);
		} else
			System.out.println("String value is not Present");
	}
}
