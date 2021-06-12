package com.SpringJdbc.studentrepo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringJdbc.entity.StudentClass;

public class StudentMaprow implements RowMapper<StudentClass> {

	@Override
	public StudentClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		StudentClass sc=new StudentClass();
		sc.setS_id(rs.getInt("id"));
		sc.setS_name(rs.getString("name"));
		sc.setS_class(rs.getString("std_class"));

		
		return sc;
	}

}
