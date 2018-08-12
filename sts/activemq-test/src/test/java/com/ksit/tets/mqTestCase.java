package com.ksit.tets;

import org.apache.activemq.ActiveMQConnectionFactory;

import org.junit.Test;

import java.io.IOException;

import javax.jms.*;

public class mqTestCase {
	
	
	@Test
	public void sendMessage() throws JMSException {
		//1. 创建连接工厂
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://118.25.144.105:61616");
		//2. 创建连接 并 开启
		Connection connection = connectionFactory.createConnection();
		connection.start();
		//3. 创建Session
		Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
		//4. 创建消息目的地
		Destination destination = session.createQueue("weixin-Queue");
		//5. 创建生产者
		MessageProducer producer = session.createProducer(destination);
		//6. 发送消息
		TextMessage textMessage = session.createTextMessage("Hello,1");
		producer.send(textMessage);
		//7. 释放资源
		producer.close();
		session.close();
		connection.close();
	}
	
	@Test
	public void receiveMessage() throws JMSException, IOException {
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://118.25.144.105:61616");
		Connection connection = connectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		Destination destination = session.createQueue("weixin-Queue");
		
		MessageConsumer consumer = session.createConsumer(destination);
		
		consumer.setMessageListener(new MessageListener() {
			
			public void onMessage(Message message) {
				TextMessage textMessage = (TextMessage) message;
				try {
					System.out.println(textMessage.getText());
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		});
		
		System.in.read();
		consumer.close();
		session.close();
		connection.close();
	}
	
	@Test
	public void testEquals() {
		Integer num1 = 2;
		String num2 = "2";
		System.out.println(num1.equals(num2));
	}
}
