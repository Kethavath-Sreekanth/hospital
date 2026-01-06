package com.alpha.hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.hospital.entity.Doctor;
import com.alpha.hospital.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}
