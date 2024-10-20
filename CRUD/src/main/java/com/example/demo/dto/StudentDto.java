package com.example.demo.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class StudentDto {
    private String firstName;
    @Size(min = 6, message = "Please lastName at least 6 character")
    private String lastName;
    @DecimalMin(value = "0", message = "total mark need to bigger than 0")
    @DecimalMax(value = "100",message = "Please totalmake less than 100")
    private Double totalMark;

    public StudentDto() {
    }

    public StudentDto(String firstName, String lastName, Double totalMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalMark = totalMark;
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
