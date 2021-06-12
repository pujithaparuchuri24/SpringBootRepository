package com.springmail.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
@Component
public class EmailUtilClass {
	@Autowired
	JavaMailSender jms;
	public boolean send(String to,String subject,String text,FileSystemResource r)
	{
		boolean flag=true;
		try
		{
			MimeMessage m=jms.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(m,r!=null?true:false);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text);
			if(r!=null)
			{
				helper.addAttachment(r.getFilename(), r);
				
			}
			jms.send(m);
		}
		catch(Exception e)
		{
			flag=false;
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean sendSimpleMail()
	{
		boolean flag=true;
		try {
		SimpleMailMessage s=new SimpleMailMessage();
		s.setTo("pujithaparuchuri1@gmail.com");
		s.setSubject("SpringBoot");
		s.setText("hi");
		jms.send(s);
		return flag;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			flag=false;
			return flag;
		}
	}

}
