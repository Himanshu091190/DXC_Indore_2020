package com.dxc.threading;

public class DeamonThreadExample extends Thread {

	@Override
	public void run() {
		System.out.println("Name of Current Thread is "+Thread.currentThread().getName());
		System.out.println("Priority of Current Thread is "+Thread.currentThread().getPriority());
		System.out.println("ID of Current Thread is "+Thread.currentThread().getId());
		
		if(Thread.currentThread().isDaemon())
			System.out.println("It is a Daemon Thread");
		else
			System.out.println("It is a User Thread");
	}

	public static void main(String[] args) {
		DeamonThreadExample t1 = new DeamonThreadExample();
		DeamonThreadExample t2 = new DeamonThreadExample();
		DeamonThreadExample t3 = new DeamonThreadExample();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
