package com.franktran.dao;

import com.franktran.model.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getStudentList();

    void createStudent(Student student);

    Student getStudentById(int id);

    void updateStudent(Integer id, Student student);
}
