package com.springmail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmail.util.EmailUtilClass;

@RestController
public class EmailController {

	@Autowired 
	EmailUtilClass emailUtil;
	@RequestMapping("/sendmail")
	public String sendMail()
	{
		FileSystemResource file=new FileSystemResource("C:\\Users\\Ln\\Documents\\Test.java");
		boolean flag=emailUtil.send("paruchuripujitha24@gmail.com","EmailUtil","hi i am from springboot",file);
		if(flag==true)
		{
			return "email sent successfully";
		}
		else 
			return "email not sent";
		
	}
	
}
