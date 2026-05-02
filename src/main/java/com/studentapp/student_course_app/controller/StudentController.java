package com.studentapp.student_course_app.controller;

import com.studentapp.student_course_app.entity.Student;
import com.studentapp.student_course_app.service.StudentService; // ✅ THIS WAS MISSING

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String viewStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "student-list";
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        service.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", service.getStudentById(id));
        return "update-student";
    }
}