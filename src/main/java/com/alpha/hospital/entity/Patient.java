package com.alpha.hospital.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;

@Entity
public class Patient {
	@Id
	private int id;
	@Length(max = 15,min = 4)
	private String name;
//	@Positive
//	private int age;
//	@Email
//	private String email;
	private String disease;
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
	public void setbdgroup(String name1) {
		this.name1 = name1;
	}
	public void setBP(String name2) {
		this.name2=name2;
	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public Patient(int id, String name, String disease,String name1) {
		super();
		this.id = id;
		this.name = name1;
		this.disease = disease;
		this.disease = bdgroup;
	}
	public Patient() {
		super();
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", disease=" + disease + "]";
	}
	
	
}
