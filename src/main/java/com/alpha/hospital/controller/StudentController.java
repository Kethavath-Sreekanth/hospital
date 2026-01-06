package com.alpha.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class StudentController
{
@Autowired
StudentEntity s;

@GetMapping("/saveStudentEntity")
public StudentEntity saveStudentEntity(@RequestBody @Valid StudentEntity s) {
         return s.saveStudentEntity(s);
}
