package com.dxc.java8features;


interface OS {
	public void osType();
	public void osBitsType();
	default void osFeatures() {
		System.out.println("Linux Gives Read, Write, Execute");
	}
}

public class FunctionalInterfaceExample implements OS {

	public static void main(String[] args) {
		FunctionalInterfaceExample mObject = new FunctionalInterfaceExample();
		mObject.osType();
		mObject.osBitsType();
		mObject.osFeatures();
	}

	@Override
	public void osType() {
		System.out.println("OS Type will be Given");
	}

	@Override
	public void osBitsType() {
		System.out.println("Bits Type of OS will be given");
	}
}
