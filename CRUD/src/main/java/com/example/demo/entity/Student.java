package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "studentss")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    private Double totalMark;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, Double totalMark) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalMark = totalMark;
    }

    public Student(Long studentId) {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(Double totalMark) {
        this.totalMark = totalMark;
    }
}
