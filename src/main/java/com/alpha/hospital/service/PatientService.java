package com.alpha.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.hospital.Repository.PatientRepo;
import com.alpha.hospital.entity.Patient;
import com.alpha.hospital.exception.PatientIdNotFound;

@Service
public class PatientService {
	
	@Autowired
	PatientRepo pr;

	public Patient savePatient(Patient p) {
	    return pr.save(p);
	}


	public Patient findPatientById(int id) {
		return pr.findById(id)
				.orElseThrow(() -> new PatientIdNotFound());
	}

	public Patient UpdatePatientById(int id, Patient p) {
		Patient patient=pr.findById(id).orElseThrow(()->new PatientIdNotFound());
		patient.setName(p.getName());
		patient.setDisease(p.getDisease());
		return pr.save(patient);
	}

	public Patient deletepPatientById(int id) {
		Patient pai=pr.findById(id).get();
		if(pai!=null) {
			pr.deleteById(id);
		}
		return pai;
	}
	public List<Patient> fetchAllPatients() {
		List<Patient>  pait=pr.findAll();
		return pait;
	}
}

