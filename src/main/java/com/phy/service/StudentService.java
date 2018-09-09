package com.phy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.phy.dao.IStuDao;
import com.phy.model.Student;
@Service
public class StudentService implements IStudentService{
    @Resource
	private IStuDao dao;
	@Override
	public boolean save(Student bean) {
		if(bean.getSno() == null) {
			return this.dao.insert(bean);
		}else {
			return this.dao.update(bean);
		}
	}

	@Override
	public boolean remove(int Sno) {
		
		return this.dao.delete(Sno);
	}

	@Override
	public List<Student> query() {
		return this.dao.select();
	}

	@Override
	public Student find(int id) {
		return this.dao.selectone(id);
	}

}
