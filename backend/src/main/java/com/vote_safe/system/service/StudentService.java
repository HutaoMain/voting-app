package com.vote_safe.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vote_safe.system.entity.Student;
import com.vote_safe.system.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student registerStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }
}
