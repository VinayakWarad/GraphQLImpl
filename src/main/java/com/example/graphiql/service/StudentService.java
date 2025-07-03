package com.example.graphiql.service;

import com.example.graphiql.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudents();

    Student getStudentsByName(String name);

    Student getStudentById(Integer id,String name);
}
