package com.example.graphiql.service;

import com.example.graphiql.model.Student;
import com.example.graphiql.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepo studentrepo;

    public StudentServiceImpl(StudentRepo studentrepo) {
        this.studentrepo = studentrepo;
    }

    @Override
    public List<Student> getStudents() {
        return studentrepo.findAll();
    }

    @Override
    public Student getStudentsByName(String name) {
        return studentrepo.findByName(name);
    }

}
