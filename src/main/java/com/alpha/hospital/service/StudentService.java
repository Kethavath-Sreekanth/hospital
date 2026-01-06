package com.alpha.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.hospital.Repository.StudentRepo;
import com.alpha.hospital.ResponceStructure.Student;
import com.alpha.hospital.entity.StudentEntity;
import com.sun.tools.javac.util.List;

@Service
public class StudentService
{
@Autowired
StudentRepo s;

public StudentEntity  saveStudent(StudentEntity  s) {
return s.save(s);
}
public StudentEntity t findStudentById(int id, StudentEntity t s) {
	return s.findBYID(id).orElseThrow(()-> new StudentNotFound());
}
public StudentEntity UpdateStudentById(int id, StudentEntity  s) {
	StudentEntity  Student=s.findById(id).orElseThrow(() - > new StudentEntityIdNotFound());
	Student.setName(s.getName());
	Student.setCourse(s.getCourse());
	return s.save(Stu);
}

public StudentEntity deleteStudentEntityById(int id) {
	Student s=s.findById(id).roElseThrow(() - > new StudentIdNotFound());
	s.deleteById(id);
	return s;
}

public List<StudentEntity> fetchALLStudentEntity(){
	List<StudentEntity> s=s.findAll();
	return s;
}
} 