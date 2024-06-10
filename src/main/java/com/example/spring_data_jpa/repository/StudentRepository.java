package com.example.spring_data_jpa.repository;

import com.example.spring_data_jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student,Integer>{

}
