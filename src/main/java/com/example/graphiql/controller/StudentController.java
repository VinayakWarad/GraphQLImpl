package com.example.graphiql.controller;

import com.example.graphiql.dto.UpdateStudentInputDto;
import com.example.graphiql.model.Student;
import com.example.graphiql.repository.StudentRepo;
import com.example.graphiql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    StudentRepo studentRepo;

    @QueryMapping
    public List<Student> getStudentsList() {
        List<Student> sl = studentService.getStudents();
        return sl;
    }

    @QueryMapping
    public Student getStudentsByName(@Argument String name) {
        Student sl = studentService.getStudentsByName(name);
        return sl;
    }

    //Mutate using parameters
    @MutationMapping
    public Student updateStudent(@Argument Integer id, @Argument String name) {
        return studentService.getStudentById(id, name);
    }

    //Mutate using DTO as input
    @MutationMapping
    public Student updateStudents(@Argument UpdateStudentInputDto input) {
        System.out.println(input.getId());
        Student student = studentRepo.findById(input.getId()).orElseThrow(() -> new RuntimeException("Student not found"));

        student.setName(input.getName());
        student.setAddress(input.getAddress());
        student.setClassName(input.getClassName());
        student.setPhoneNum(input.getPhoneNum());
        return studentRepo.save(student);

    }

}
