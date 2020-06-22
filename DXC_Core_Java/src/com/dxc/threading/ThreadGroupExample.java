package com.dxc.threading;

public class ThreadGroupExample implements Runnable{

	
	public static void main(String[] args) {
		ThreadGroupExample runnable = new ThreadGroupExample();
		ThreadGroup tg1 = new ThreadGroup("Parent Thread");
		
		Thread t1 = new Thread(tg1, runnable,"one");
		t1.start();
		Thread t2 = new Thread(tg1, runnable,"two");
		t2.start();
		Thread t3 = new Thread(tg1, runnable,"three");
		t3.start();
		
		System.out.println("ThreadGroupName is "+tg1.getName());
		tg1.list();
	}

	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName());	
	}

}
