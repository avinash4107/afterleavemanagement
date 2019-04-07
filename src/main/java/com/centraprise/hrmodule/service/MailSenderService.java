package com.centraprise.hrmodule.service;



import javax.mail.MessagingException;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class MailSenderService {

	@Scheduled(cron = "5 * * * * *")
	public void sendMail() throws MessagingException {

	}
}
