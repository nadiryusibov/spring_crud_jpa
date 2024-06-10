package com.example.spring_data_jpa.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data                   // data annotatin create getter and setter
@AllArgsConstructor      // dolu constructor
@NoArgsConstructor       // bos constructor
@Table(name = "aze_student")
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName = "student_sequence",allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    private Integer id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "surname",nullable = false)
    private String surname;
    @Column(name = "birthDate",nullable = false)
    private Integer dateOfBirth;
    @Column(name = "studentNumber",nullable = false,unique = true)
    private String studentNumber;
}
