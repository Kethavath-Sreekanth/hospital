package com.alpha.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CourseEntity 
{
@Id
private int id;
private String subject;
private double fee;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
public CourseEntity(int id, String subject, double fee) {
	super();
	this.id = id;
	this.subject = subject;
	this.fee = fee;
}
public CourseEntity() {
	super();
}
@Override
public String toString() {
	return "CourseEntity [id=" + id + ", subject=" + subject + ", fee=" + fee + "]";
}

}
