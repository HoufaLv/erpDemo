package com.ksit.tets;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringActiveMqTestCase {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	/**
	 * 发送消息
	 */
	@Test
	public void sendMessage() {
		while (true) {
			jmsTemplate.send("weiXin-Queue",new MessageCreator() {
				
				public Message createMessage(Session session) throws JMSException {
					return session.createTextMessage("Hello!" + System.currentTimeMillis());
				}
			});
		}
	}
	
	@Test
	public void reciveMessage() throws IOException {
		System.out.println("spring 容器已经启动!");
		System.in.read();
	}
	
}
