package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.entity.Student;
import com.example.spring_data_jpa.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    final private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/all")
    public List<Student>getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/new")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudentId(id);
    }

    @PutMapping("/edit/{id}")
    public Student updateStudent(@PathVariable Integer id,@RequestBody Student student){
        return studentService.editStudent(id,student);
    }
}
