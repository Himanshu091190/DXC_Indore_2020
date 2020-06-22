package com.dxc.threading;

public class MultiThreadExample implements Runnable{

	public static void main(String[] args) {
		Thread thread1 = new Thread("First Thread");
		Thread thread2 = new Thread("Second Thread");
		
		thread1.start();
		thread2.start();
		
		System.out.println("Thread names are as following\n\n"+thread1.getName()+"\n"+thread2.getName());
	}

	@Override
	public void run() {
		System.out.println("Hi i am a run method");
	}

}
