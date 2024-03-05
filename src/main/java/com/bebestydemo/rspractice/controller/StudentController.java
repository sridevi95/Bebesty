package com.bebestydemo.rspractice.controller;

import com.bebestydemo.rspractice.module.Student;
import com.bebestydemo.rspractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

@Autowired
    StudentService studentService;

    @GetMapping("/getall")
    public List<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }
    @GetMapping("/getstudentbyid/{studentid}")
    public Student getStudentById(@PathVariable Integer studentId){
        return this.studentService.getStudentById(studentId);
    }

    @PostMapping(value="/addstudent")
    public String addNewStudent(@RequestBody Student studentData){
        return this.studentService.addStudent(studentData);
    }
    @PutMapping("updatestudent")
    public String updateStudentData(@PathVariable Integer studentId,Student newData){
        return this.updateStudentData(studentId,newData);
    }

    @DeleteMapping("deletestudent/{id}")
    public void deleteById(@PathVariable Integer studentId){
        this.studentService.deleteStudentById(studentId);
    }

}
