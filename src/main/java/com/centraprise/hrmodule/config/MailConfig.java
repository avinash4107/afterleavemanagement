package com.centraprise.hrmodule.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

	@Bean
	public MailSender newMailSender() {
		JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
		mailSenderImpl.setHost("smtp.gmail.com");
		mailSenderImpl.setUsername("tech.avinash1995@gmail.com");
		mailSenderImpl.setPassword("9441213433");
		Properties props = new Properties();
		props.setProperty("mail.smtp.auth", "true");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.smtp.port", "465");
		mailSenderImpl.setJavaMailProperties(props);
		return mailSenderImpl;

	}

}
