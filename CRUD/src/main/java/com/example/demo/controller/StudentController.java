package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    public StudentService studentService;
    @PostMapping("/creatUser")
    public Student createStudent(@RequestBody @Valid StudentDto request){
      return  studentService.createStudent(request);
    }
    @GetMapping("/getallUser")
    public List<Student>getAllStudents(){
        return  studentService.getAllStudents();
    }
    @GetMapping("/getStudent/{studentId}")
    public Student getStudentfromId(@PathVariable Long studentId){
        return  studentService.getStudentfromId(studentId);
    }
    @DeleteMapping("/deleteStudent/{studentId}")
    public String deleteStudentById(@PathVariable Long studentId){
     return    studentService.deleteStudentById(studentId);
    }
    @PutMapping("/update/{studentId}")
    public Student updateStudent(@PathVariable Long studentId ,@RequestBody StudentDto request){
        return  studentService.updateStudent(studentId ,request);
    }
}
