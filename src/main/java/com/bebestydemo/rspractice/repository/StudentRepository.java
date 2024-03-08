package com.bebestydemo.rspractice.repository;

import com.bebestydemo.rspractice.module.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}


