package com.example.graphiql.controller;

import com.example.graphiql.model.Student;
import com.example.graphiql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @QueryMapping
    public List<Student> getStudentsList(){
        List<Student> sl=studentService.getStudents();
        return sl;
    }
}
