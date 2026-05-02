package com.studentapp.student_course_app.repository;

import com.studentapp.student_course_app.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}