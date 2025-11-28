package com.alpha.hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.hospital.entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
