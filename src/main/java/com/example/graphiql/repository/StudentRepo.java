package com.example.graphiql.repository;
import com.example.graphiql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

    List<Student> findAll();
    Student findByName(String name);
}
