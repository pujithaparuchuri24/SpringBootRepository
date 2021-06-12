package com.SpringJdbc.studentrepo;

import java.util.List;
import java.util.Map;

import com.SpringJdbc.entity.StudentClass;

public interface StudentRepo {
	public void createTable();

	public int insertRecord(int id,String name, String s_class);
	
    public Map<String,Object> get(int id);
    public List<StudentClass> getAll();
}
