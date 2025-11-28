package com.alpha.hospital.entity;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Positive;

@Entity
public class Doctor {
     @Id
	private int id;
    @Length(max = 10,min = 4)
	private String name;
//    @Positive
//    private int age;
	private String specialization;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Patient> plist;

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
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}


	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<Patient> getPlist() {
		return plist;
	}

	public void setPlist(List<Patient> plist) {
		this.plist = plist;
	}

	public Doctor(int id, String name, String specialization, List<Patient> plist) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.plist = plist;
	}

	public Doctor() {
		super();
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", plist=" + plist + "]";
	}
	
	
}
