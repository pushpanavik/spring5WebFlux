//package com.bridgelabz.login.config;
//
//import javax.jms.ConnectionFactory;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
//
//public class JMSListenerConfiguration {
//
//	@Autowired
//	ConnectionFactory connectionFactory;
//	
//	@Bean
//	DefaultJmsListenerContainerFactory jmsListenerContainerFactory()
//	{
//	 DefaultJmsListenerContainerFactory factory=new DefaultJmsListenerContainerFactory();
//	 factory.setConnectionFactory(connectionFactory);
//	 factory.setConcurrency("1-1");
//	 return factory;
//	}
//}
