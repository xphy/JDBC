package com.phy.dao;

import java.util.List;

import com.phy.model.Student;

public interface IStuDao {
    public boolean delete(int id);
    public boolean update(Student bean);
    public boolean insert(Student bean);
    public List<Student> select();
    public Student selectone(int id);
}
