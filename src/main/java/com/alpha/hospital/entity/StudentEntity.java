package com.alpha.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity 
{
	@Id
private int id;
private String name;
private int age;
private double marks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
public StudentEntity(int id, String name, int age, double marks) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.marks = marks;
}
public StudentEntity() {
	super();
}
@Override
public String toString() {
	return "StudentEntity [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
}

}
