package com.dxc.jmsmain;

import com.dxc.jmsconsumer.Consumer;
import com.dxc.jmsproducer.Producer;

public class MainClass {
	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		
		Thread producerThread = new Thread(producer);
		producerThread.start();
		
		Thread consumerThread = new Thread(consumer);
		consumerThread.start();
	}
}
