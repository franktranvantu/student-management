package com.franktran.service;

import com.franktran.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentList();

    void createStudent(Student student);
}
