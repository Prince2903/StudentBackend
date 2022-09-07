package com.example.studentbackend.repository;

import com.example.studentbackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositiory extends JpaRepository<Student, Integer> {
}
