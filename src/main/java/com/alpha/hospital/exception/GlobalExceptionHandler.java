package com.alpha.hospital.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alpha.hospital.ResponceStructure.ResponceStructure;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	 @ExceptionHandler(DoctorIdNotFound.class)
	    public ResponseEntity<ResponceStructure<String>> handleDoctorIdNotFound(DoctorIdNotFound dr) {
		 ResponceStructure<String> stru = new ResponceStructure<>();
	        stru.setStatuscode(HttpStatus.NOT_FOUND.value());
	        stru.setMessage("Doctor Not Found");
	        stru.setData(dr.getMessage());

	        return new ResponseEntity<>(stru, HttpStatus.NOT_FOUND);
	    }
	 
	 @ExceptionHandler(PatientIdNotFound.class)
	    public ResponseEntity<ResponceStructure<String>> handlePatientIdNotFound(PatientIdNotFound p) {

	        ResponceStructure<String> stru = new ResponceStructure<>();
	        stru.setStatuscode(HttpStatus.NOT_FOUND.value());
	        stru.setMessage("Patient Not Found");
	        stru.setData(p.getMessage());

	        return new ResponseEntity<>(stru, HttpStatus.NOT_FOUND);
	    }

	 @ExceptionHandler(MethodArgumentNotValidException.class)
	 public ResponceStructure<Map<String,String>> handleMethodNotValid(MethodArgumentNotValidException ex){

	     Map<String,String> errormap = new HashMap<>();

	     List<ObjectError> objectErrors = ex.getAllErrors();

	     for(ObjectError objErr : objectErrors) {

	         if(objErr instanceof FieldError) {
	             FieldError fe = (FieldError) objErr;

	             System.out.println(fe.getDefaultMessage());
	             System.out.println(fe.getField());

	             errormap.put(fe.getField(), fe.getDefaultMessage());
	         }
	     }

	     ResponceStructure<Map<String,String>> rs = new ResponceStructure<>();
	     rs.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
	     rs.setMessage("validation faild");
	     rs.setData(errormap);

	     return rs;
	 }


}

