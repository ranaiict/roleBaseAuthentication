package com.example.rolebasedauthorizationwithexample.repository;

import com.example.rolebasedauthorizationwithexample.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
