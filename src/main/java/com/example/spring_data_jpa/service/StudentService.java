package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.Student;
import com.example.spring_data_jpa.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentId(Integer id) {
        studentRepository.deleteById(id);
    }

    public Student editStudent(Integer id, Student student) {
        Optional<Student> foundStudent = studentRepository.findById(id);
        if (foundStudent.isPresent()){
            Student newStudent = foundStudent.get();

            newStudent.setName(student.getName());
            newStudent.setSurname(student.getSurname());
            newStudent.setDateOfBirth(student.getDateOfBirth());
            newStudent.setStudentNumber(student.getStudentNumber());

            return studentRepository.save(newStudent);
        }
        return null;
    }
}
