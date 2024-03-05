package com.bebestydemo.rspractice.service;

import com.bebestydemo.rspractice.module.Student;
import com.bebestydemo.rspractice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    public String updateStudent(Integer studentId, Student updatedStudent) {
        Student oldStudentData = this.studentRepository.findById(studentId).orElse(null);
        if (oldStudentData != null) {
            oldStudentData.setName(updatedStudent.getName());
            oldStudentData.setLocation(updatedStudent.getLocation());
            oldStudentData.setEmail(updatedStudent.getEmail());
            oldStudentData.setCourse(updatedStudent.getCourse());
            this.studentRepository.save(oldStudentData);
            return "Student data updated";
        } else {
            return "Student not found";
        }
    }

    public String addStudent(Student newStudent) {
        this.studentRepository.save(newStudent);
        return "Student added";
    }

    public Student getStudentById(Integer studentId) {
        Student selectedStudent = null;
        if (this.studentRepository.findById(studentId).isPresent()) {
            this.studentRepository.findById(studentId);
        }
        return selectedStudent;
    }

    public String deleteStudentById(Integer studentId) {
        if (this.studentRepository.findById(studentId).isPresent()) {
            this.studentRepository.deleteById(studentId);
            return "Student data deleted";
        } else {
            return "Student not found";
        }
    }
}