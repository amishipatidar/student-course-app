package com.studentapp.student_course_app.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    public Student() {}

    // ✅ GETTERS
    public Long getId() { return id; }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public List<Course> getCourses() { return courses; }

    // ✅ SETTERS
    public void setId(Long id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setEmail(String email) { this.email = email; }

    public void setCourses(List<Course> courses) { this.courses = courses; }
}