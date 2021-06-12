package com.SpringJdbc.studentrepo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SpringJdbc.entity.StudentClass;

@Repository
public class StudentRepoImpl implements StudentRepo {
     @Autowired
	private JdbcTemplate jt;
    private String create="create table student (id number,name varchar2(20),std_class varchar2(10))";
	private String update="insert into student (id,name,std_class) values (?,?,?) ";
	private String get="select * from student where id=?";
	private String getall="select * from student";
    @Override
	public void createTable() {
	 jt.execute(create);
	}
	@Override
	public int insertRecord(int id, String name, String s_class) {
		int i=jt.update(update,id,name,s_class);
		return i;
	}
	@Override
	public Map<String,Object> get(int id) {
		Map<String,Object> m=jt.queryForMap(get, id);
	     		return m;
	}
	@Override
	public List<StudentClass> getAll() {
		List<StudentClass> li=jt.query(getall,new StudentMaprow());
		return li;
	}

}
