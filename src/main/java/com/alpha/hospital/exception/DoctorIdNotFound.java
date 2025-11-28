package com.alpha.hospital.exception;

public class DoctorIdNotFound extends RuntimeException {
	    
	    String message="Doctor Id not found";

		public String getMessage() {
			return message;
		}
	    
}

