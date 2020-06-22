package com.dxc.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkingThread implements Runnable {

	private String str;
	
	public WorkingThread(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(start) message is "+str);
		showMessage();
		System.out.println("Ending thread "+Thread.currentThread().getName());
	}
	
	private void showMessage() {
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	
}

public class ThreadPoolExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=0; i<10; i++) {
			Runnable worker = new WorkingThread(""+i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {}
		
		System.out.println("Finished with all the threads");
	}

}
