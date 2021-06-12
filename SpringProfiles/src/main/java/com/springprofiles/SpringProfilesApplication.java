package com.springprofiles;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springprofiles.Model.ModelClass;

@SpringBootApplication
public class SpringProfilesApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringProfilesApplication.class, args);
		 ModelClass  mc=ac.getBean("model",ModelClass.class);
		System.out.println(mc.getProfile());
	}

}
