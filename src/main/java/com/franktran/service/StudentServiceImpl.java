package com.franktran.service;

import com.franktran.dao.StudentDao;
import com.franktran.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }

    @Override
    public void createStudent(Student student) {
        studentDao.createStudent(student);
    }
}
