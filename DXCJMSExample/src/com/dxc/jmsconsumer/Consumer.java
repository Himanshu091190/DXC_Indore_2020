package com.dxc.jmsconsumer;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumer implements Runnable{

	@Override
	public void run() {
		try {
			// Creating a Connection Factory
			ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");
			
			// Creating a Connection to Factory
			Connection connection = factory.createConnection();
			
			// Starting the Connection
			connection.start();
			
			// Creating a Session which is non Transactional
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			// Creating a Destination Queue
			Destination queue = session.createQueue("Queue");
			
			// Creating a Consumer
			MessageConsumer consumer = session.createConsumer(queue);
			Message message = consumer.receive(1000);
			
			
			if(message instanceof TextMessage) {
				TextMessage textMessage = (TextMessage) message;
				String text = textMessage.getText();
				System.out.println("Consumer Received: "+text);
					
			}
			
			session.close();
			connection.close();
		}
		catch(Exception e) {
			System.out.println("Exception is "+e);
		}
	}

}
