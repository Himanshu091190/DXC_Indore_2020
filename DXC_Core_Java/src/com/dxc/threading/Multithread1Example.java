package com.dxc.threading;

public class Multithread1Example extends Thread {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Exception is "+e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Multithread1Example t1 = new Multithread1Example();
		Multithread1Example t2 = new Multithread1Example();
		
		t1.run();
		t2.run();
	}

}
