package com.phy.control;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phy.model.Student;
import com.phy.service.IStudentService;

@RestController
@RequestMapping("/student/")
public class StudentCro {
	@Resource
    private IStudentService service;
	
	@RequestMapping("query.do")
	public List<Student> query(){
		return this.service.query();
		
	} 
	@RequestMapping("find.do")
	public Student find(int id){
		return service.find(id);
	}
	
	@RequestMapping("remove.do")
	public boolean remove(int Sno){
		return service.remove(Sno);
	}
	
	@RequestMapping("save.do")
	public boolean save(Student bean){
		return service.save(bean);
	}
}
