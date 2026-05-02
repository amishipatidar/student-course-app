package com.studentapp.student_course_app.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String duration;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    // getters setters
}