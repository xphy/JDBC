package com.phy.service;

import java.util.List;

import com.phy.model.Student;

public interface IStudentService {
     public boolean save(Student bean);
     public boolean remove(int id);
 	 public List<Student> query();
 	 public Student find(int id);
}
