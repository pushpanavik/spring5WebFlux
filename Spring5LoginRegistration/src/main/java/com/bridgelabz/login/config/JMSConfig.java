//package com.bridgelabz.login.config;
//
//import java.util.Arrays;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.core.JmsTemplate;
//
//@Configuration
//public class JMSConfig 
//{
// private final String DEFAULT_BROKER_URL="tcp://localhost:61616";
// private final String MAIL_QUEUE="mail.queue";
//	
// 
// @Bean
// public ActiveMQConnectionFactory connectionFactory()
// {
//  ActiveMQConnectionFactory connectionFactory=new ActiveMQConnectionFactory();
//  connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
//  connectionFactory.setTrustedPackages(Arrays.asList("com.bridgeit.fundooNote"));
//  return connectionFactory;
// }
// 
// 
// @Bean
// public JmsTemplate jmsTemplate()
// {
//  JmsTemplate jmsTemplate=new JmsTemplate();
//  jmsTemplate.setConnectionFactory(connectionFactory());
//  jmsTemplate.setDefaultDestinationName(MAIL_QUEUE);
//  return jmsTemplate;
// }
//
// 
// 
//}