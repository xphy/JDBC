package com.phy.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.phy.model.Student;

@Repository
public class StuDao implements IStuDao{
	@Resource
    private JdbcTemplate temp;
	@Override
	public boolean delete(int Sno) {
		String sql=" delete from student where Sno=?";
		if(temp.update(sql,Sno)>0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean update(Student bean) {
		String sql="update student set Sname=?,Sage=?,Ssex=?,Sdept=? where Sno=?";
		int n = temp.update(sql,bean.getSname(),bean.getSage(),bean.getSsex(),bean.getSdept(),bean.getSno());
		if(n>0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean insert(Student bean) {
		String sql="insert into student(Sname,Sage,Ssex,Sdept) values(?,?,?,?)";
		int n = temp.update(sql,bean.getSname(),bean.getSage(),bean.getSsex(),bean.getSdept());
		if(n>0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Student> select() {
		String sql="select * from student";
		List<Student> list = temp.query(sql, new Object[]{},new BeanPropertyRowMapper<Student>(Student.class));
		return list;
	}

	@Override
	public Student selectone(int Sno) {
		String sql="select * from student where Sno=?";
		List<Student> list = temp.query(sql, new Object[]{Sno},new BeanPropertyRowMapper<Student>(Student.class));
		if(list!=null&&list.size()>0) {
			return list.get(0);
		}else {
		return null;
		}
	}

}
