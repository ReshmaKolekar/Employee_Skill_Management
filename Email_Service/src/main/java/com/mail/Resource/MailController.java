package com.mail.Resource;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.model.Mail;
import com.mail.service.MailService;

@RestController
@RequestMapping("/Mail")
public class MailController {
	
	@Autowired
	MailService mailService;
	
	/*@RequestMapping("/sendmail")
    public String sendMail() throws MessagingException{
		
        	System.out.println("inside sendMail");
        	return mailService.sendEmail();
	}  */
	
	@RequestMapping("/sendmail")
	//@PostMapping("/sendmail")
    public String sendMail(@RequestBody Mail mail) throws MessagingException{
		
        	System.out.println("inside sendMail");
        	return mailService.sendEmail(mail);
	}     
}
   
   

