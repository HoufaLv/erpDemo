package com.ksit.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class WeiXinLinstener implements MessageListener{

	public void onMessage(Message message) {
		System.out.println("监听器已经启动");
		
		TextMessage textMessage = (TextMessage) message;
		try {
			System.out.println(textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
