package com.alpha.hospital.exception;

public class PatientIdNotFound extends RuntimeException{
	
	String message="Patient Id not found";

	public String getMessage() {
		return message;
	}

}
