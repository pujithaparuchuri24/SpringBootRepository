package com.SpringJdbc.studetservice;

import java.util.List;
import java.util.Map;

import com.SpringJdbc.entity.StudentClass;

public interface StudentService {
   public void createTable();
   public Map<String,Object> get(int id);
   public int insertRecord(int id,String name,String s_class);
public List<StudentClass> getall();
}
