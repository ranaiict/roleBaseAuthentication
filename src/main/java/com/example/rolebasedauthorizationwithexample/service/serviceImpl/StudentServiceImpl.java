package com.example.rolebasedauthorizationwithexample.service.serviceImpl;

import com.example.rolebasedauthorizationwithexample.model.Student;
import com.example.rolebasedauthorizationwithexample.repository.StudentRepository;
import com.example.rolebasedauthorizationwithexample.service.StudentService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> listStudent() {
        return studentRepository.findAll();
    }
}
