package com.dxc.threading;

public class ThreadPriorityExample extends Thread{

	@Override
	public void run() {
		System.out.println("Running Thread Name is "+Thread.currentThread().getName());
		System.out.println("Running Thread Priority is "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		ThreadPriorityExample t1 = new ThreadPriorityExample();
		ThreadPriorityExample t2 = new ThreadPriorityExample();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}

}
