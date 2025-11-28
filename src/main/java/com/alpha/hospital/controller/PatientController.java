package com.alpha.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.hospital.entity.Patient;
import com.alpha.hospital.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService ps;
	@PostMapping("/savepatient")
	public Patient savePatient(@RequestBody Patient p) {
	    return ps.savePatient(p);
	}
	@GetMapping("/findPatientById")
	public Patient findPatientById(@RequestParam int id) {
		return ps.findPatientById(id);
		
	}
	@PutMapping("/updatepatientById")
	public Patient updatepatientById(@RequestParam int id,@RequestBody Patient p) {
		return ps.UpdatePatientById(id,p);
	}
	
	@DeleteMapping("/deletepatientById")
	public Patient deletePatientById(@RequestParam int id) {
		return ps.deletepPatientById(id);
		
	}
	
	@GetMapping("/fetchallpaitents")
	public List<Patient> fetchAllPatients() {
		return ps.fetchAllPatients();
	}
}

