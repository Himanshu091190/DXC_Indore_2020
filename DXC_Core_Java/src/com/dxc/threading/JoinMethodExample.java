package com.dxc.threading;

public class JoinMethodExample extends Thread{

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
		JoinMethodExample jm1 = new JoinMethodExample();
		JoinMethodExample jm2 = new JoinMethodExample();
		JoinMethodExample jm3 = new JoinMethodExample();
		
		jm1.start();
		try {
			jm1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		jm2.start();
		jm3.start();
	}

}
