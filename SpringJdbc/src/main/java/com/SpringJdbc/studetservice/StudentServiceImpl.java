package com.SpringJdbc.studetservice;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringJdbc.entity.StudentClass;
import com.SpringJdbc.studentrepo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
    
	@Autowired
	private StudentRepo repo;
	@Override
	public void createTable() {
      repo.createTable();
	}
	@Override
	public int insertRecord(int id, String name, String s_class) {
		return repo.insertRecord(id,name,s_class);
		
	}
	@Override
	public Map<String, Object> get(int id) {
		return repo.get(id);
	}
	@Override
	public List<StudentClass> getall() {
		return repo.getAll();
	}

}
