package com.mail.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.mail.model.Mail;

@Service
public class MailServiceImpl implements MailService {

	@Autowired
	private JavaMailSender sender;

	@Override
	public String sendEmail(Mail mail) {
		MimeMessage message = sender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setTo(mail.getTo());
			helper.setText(mail.getContent());
			helper.setSubject(mail.getSubject());

			// add attachement
			FileSystemResource file = new FileSystemResource("D:\\aaa.txt");
			helper.addAttachment(file.getFilename(), file);

			sender.send(message);
			return "mail Sent";
		} catch (Exception e) {
			System.out.println(e);
			return e + "failed to send mail";
		}
	}

	/*
	 * @Override public String sendEmail() {
	 * 
	 * try{ MimeMessage message = sender.createMimeMessage(); MimeMessageHelper
	 * helper = new MimeMessageHelper(message);
	 * 
	 * helper.setTo("reshmawalekar2694@gmail.com");
	 * helper.setText("Is it complted?");
	 * helper.setSubject("Microservices Training");
	 * 
	 * sender.send(message); return "mail Sent"; } catch(Exception e) { return
	 * "failed to send mail"; }
	 * 
	 * }
	 */
}
