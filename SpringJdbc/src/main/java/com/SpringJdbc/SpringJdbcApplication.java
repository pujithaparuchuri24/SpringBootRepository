package com.SpringJdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringJdbc.entity.StudentClass;
import com.SpringJdbc.studetservice.StudentService;

@SpringBootApplication
@RestController
public class SpringJdbcApplication {
   @Autowired
   private StudentService stud;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}
	@RequestMapping("/")
	public String create()
	{
		stud.createTable();
		return "created";
	}
	@RequestMapping("/insert")
	public String insertRecord()
	{
		int i=stud.insertRecord(1, "prasanth", "10th");
		stud.insertRecord(10, "jaya", "11th");
		return i+"record inserted";
	}
	@RequestMapping("/get/{id}")
	public Map<String,Object> getRecord(@PathVariable int id)
	{
		
		return stud.get(id);
	}
	@RequestMapping("/getall")
	public List<StudentClass> getall()
	{
		return stud.getall();
	}

}
