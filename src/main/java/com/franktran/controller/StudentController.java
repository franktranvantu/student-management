package com.franktran.controller;

import com.franktran.dao.StudentDao;
import com.franktran.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    private final StudentDao studentDao;

    public StudentController(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @GetMapping("/show-student-list")
    public String showStudentList(Model model) {
        List<Student> students = studentDao.getStudentList();
        model.addAttribute("students", students);
        return "student-list";
    }

    @GetMapping("/show-create-student")
    public String showCreateStudent(@ModelAttribute("student") Student student) {
        return "create-student";
    }

    @PostMapping("/create-student")
    public String createStudent(@ModelAttribute("student") Student student) {
        studentDao.createStudent(student);
        return "redirect:/show-student-list";
    }
}
