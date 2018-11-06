package com.bridgelabz.login.utility;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.bridgelabz.login.model.User;

import reactor.core.publisher.TopicProcessor;

@Component
public class MailSender  {

	
	private JavaMailSender mailSender;
	

	public MailSender(TopicProcessor<User> forgotUser) {
		forgotUser.subscribe(user -> {
			System.out.println(Thread.currentThread().getId());
			try {
				send(user);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
	}
	
	public void send(User user) throws Exception {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		mimeMessageHelper.setTo("aadira392@gmail.com");
		mimeMessageHelper.setSubject("Link for reset password");
		
		String token=GenerateToken.generateUserToken(user.getFirstname(), user.getLastname(), user.getUserId(), user.getEmail());
	
		mimeMessageHelper.setText("Please click the link below to verify yourself \n\n "+
									"http://localhost:8080/resetpassword"+token);
		mailSender.send(mimeMessage);
	}

}