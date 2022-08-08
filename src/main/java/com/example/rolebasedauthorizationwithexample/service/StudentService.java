package com.example.rolebasedauthorizationwithexample.service;

import com.example.rolebasedauthorizationwithexample.model.Student;
import org.apache.catalina.User;

import java.util.List;

public interface StudentService {
    Student save(Student student);

    List<Student> listStudent();
}
