package com.studentapp.student_course_app.service;

import com.studentapp.student_course_app.entity.Student;
import com.studentapp.student_course_app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student saveStudent(Student student) {
        try {
            return repo.save(student);
        } catch (Exception e) {
            throw new RuntimeException("Error saving student");
        }
    }

    public Student getStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }
}