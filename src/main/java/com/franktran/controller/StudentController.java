package com.franktran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/show-student-list")
    public String showStudentList() {
        return "student-list";
    }
}
