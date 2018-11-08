package com.bridgelabz.login.utility;

//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.ObjectMessage;
//import javax.jms.Session;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.jms.core.MessageCreator;
//import org.springframework.stereotype.Component;
//
//import com.bridgelabz.login.model.EmailDto;
//
//
//
//@Component
//public class JmsMessageSender {
//	@Autowired
//	private  JmsTemplate jmstemplate;
//	
//	
//	public void sendMessage(final EmailDto emailDto)
//	{
//		System.out.println("comes under sendmessage  method of template jms");
//		jmstemplate.send(new MessageCreator() {
//							
//			public Message createMessage(Session session) throws JMSException {
//				ObjectMessage objectMessage=session.createObjectMessage( emailDto);
//				System.out.println("comes under creating message");
//				return objectMessage;
//			}
//		});
//	}
//
//
//	
//
//}