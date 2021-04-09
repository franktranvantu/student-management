package com.franktran.service;

import com.franktran.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentList();

    void createStudent(Student student);

    Student getStudentById(int id);

    void updateStudent(Integer id, Student student);

    void deleteStudent(int id);
}
