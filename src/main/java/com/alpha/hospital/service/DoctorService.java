package com.alpha.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.hospital.Repository.DoctorRepo;
import com.alpha.hospital.entity.Doctor;
import com.alpha.hospital.exception.DoctorIdNotFound;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepo dr;

	public Doctor savedoctor(Doctor d) {
	   return dr.save(d);
	}

	public Doctor findDoctorById(int id) {
	    return dr.findById(id)
	             .orElseThrow(() -> new DoctorIdNotFound());
	}
	public Doctor UpdatedoctorById(int id, Doctor d) {
		Doctor doc = dr.findById(id).orElseThrow(() -> new DoctorIdNotFound());
		doc.setName(d.getName());
		doc.setSpecialization(d.getSpecialization());
		return dr.save(doc);
	}

	public Doctor deleteDoctorById(int id) {
	    Doctor doc = dr.findById(id)
	                   .orElseThrow(() -> new DoctorIdNotFound());
	    
	    dr.deleteById(id);
	    return doc;
	}


	public List<Doctor> fetchAllDoctor() {
		List<Doctor> drr=dr.findAll();
		return drr;
	}
	
	

}
