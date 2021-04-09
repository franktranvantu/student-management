package com.franktran.service;

import com.franktran.dao.StudentDao;
import com.franktran.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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
        if (Objects.equals(student.getCountry(), "Vietnam")) {
            System.out.printf("Sending email to %s%n", student.getName());
        }
    }

    @Override
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public void updateStudent(Integer id, Student student) {
        studentDao.updateStudent(id, student);
    }
}
