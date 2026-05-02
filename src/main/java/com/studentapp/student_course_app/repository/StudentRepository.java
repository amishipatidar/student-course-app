package com.studentapp.student_course_app.repository;

import com.studentapp.student_course_app.entity.Student;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s JOIN s.courses c WHERE c.title = :title")
    List<Student> findStudentsByCourseTitle(@Param("title") String title);
}