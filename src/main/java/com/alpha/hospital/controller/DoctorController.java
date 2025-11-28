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
import org.springframework.web.service.annotation.DeleteExchange;

import com.alpha.hospital.entity.Doctor;
import com.alpha.hospital.service.DoctorService;

import jakarta.validation.Valid;

@RestController
public class DoctorController {
	@Autowired
	DoctorService ds;
	
	@PostMapping("/savedoctor")
	public Doctor saveDoctor(@RequestBody @Valid Doctor d){
		return ds.savedoctor(d);
		
	}
	
	@GetMapping("/findDoctorById")
	public Doctor findDoctorById(@RequestParam int id) {
		return ds.findDoctorById(id);
		
	}
	
	@PutMapping("/updateDoctorById")
	public Doctor updateDoctorById(@RequestParam int id,@RequestBody Doctor d) {
		return ds.UpdatedoctorById(id,d);
	}
    @DeleteMapping("/deletedoctorById")
    public Doctor deleteDoctorById(@RequestParam int id) {
    	return ds.deleteDoctorById(id);
    }
    
    @GetMapping("/fetchalldoctors")
    public List<Doctor> fetchAllDoctor() {
    	return ds.fetchAllDoctor();
    }
}
