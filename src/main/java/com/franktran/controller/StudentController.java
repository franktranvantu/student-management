package com.franktran.controller;

import com.franktran.model.Student;
import com.franktran.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Objects;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/show-student-list")
    public String showStudentList(Model model) {
        List<Student> students = studentService.getStudentList();
        model.addAttribute("students", students);
        return "student-list";
    }

    @GetMapping("/show-create-student")
    public String showCreateStudent(@ModelAttribute("student") Student student, Model model) {
        model.addAttribute("action", "Create");
        return "create-student";
    }

    @PostMapping("/save-student")
    public String saveStudent(Student student) {
        if (Objects.isNull(student.getId())) {
            studentService.createStudent(student);
        } else {
            studentService.updateStudent(student.getId(), student);
        }
        return "redirect:/show-student-list";
    }

    @GetMapping("/show-update-student/{id}")
    public String showUpdateStudent(@PathVariable int id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("action", "Update");
        model.addAttribute("student", student);
        return "create-student";
    }

    @GetMapping("/delete-student/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "redirect:/show-student-list";
    }
}
