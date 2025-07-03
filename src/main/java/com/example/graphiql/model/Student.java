package com.example.graphiql.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

/**
 * Student entity representing a student record.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Student() {
    }

    private String address;
    private String className;
    private String phoneNum;

    public Student(String address, String className, Integer id, String name, String phoneNum) {
        this.address = address;
        this.className = className;
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


    }
