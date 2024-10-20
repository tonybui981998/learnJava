package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;
    public Student createStudent(StudentDto request){

        Student student = new Student();
        if (studentRepository.existsByFirstName(request.getFirstName()))
            throw new RuntimeException("Student already exist");

        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setTotalMark(request.getTotalMark());
return studentRepository.save(student);

    }
    public List<Student> getAllStudents(){
    return  studentRepository.findAll();
    }
    public Student getStudentfromId(Long studentId){
        return studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Sorry user not found"));
    }
    public String deleteStudentById(Long studentId){
        studentRepository.deleteById(studentId);
        return "success";
    }
    public Student updateStudent(Long studentId ,StudentDto request){
 Student student =  studentRepository.findById(studentId).orElse(null);
student.setFirstName(request.getFirstName());
student.setLastName(request.getLastName());
student.setTotalMark(request.getTotalMark());
 studentRepository.save(student);
 return student;
    }
}
