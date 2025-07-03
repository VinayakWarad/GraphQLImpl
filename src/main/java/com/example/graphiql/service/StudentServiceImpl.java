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

    @Override
    public Student getStudentById(Integer id,String name) {
       Student s= studentrepo.findById(id).orElseThrow(()->new RuntimeException("STudent does not exists"));
       s.setName(name);
       //Below confirms in console that name got updated
        Student s1=studentrepo.findById(id).orElseThrow(()->new RuntimeException("STudent does not exists"));
       System.out.println("classname"+s1.getName());
       return s;
    }

}
