package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Employee;


@Controller
public class controller {
    @Autowired	
	Daorepo daore;
	@RequestMapping("/")
	public String data() {
		return "student.jsp";
	}
    @PostMapping(value="/data")
	public String datas(@ModelAttribute Employee student,Model m) {
        daore.save(student); 
		return "student.jsp";
	}
    @PostMapping(value="/update")
    public String update(@ModelAttribute Employee employee )
    {
    	System.out.println(employee);
    	daore.save(employee);
    	return "student.jsp";
    }
    
    @GetMapping(value="/validateid")
    @ResponseBody
    public String validate(@RequestParam int code)
    {
    	if(daore.existsById(code))
    	{
    		return code+"already exsisted";
    	}
    	return "";
    }
   

}
