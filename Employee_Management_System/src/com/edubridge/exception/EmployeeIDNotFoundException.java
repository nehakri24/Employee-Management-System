package com.edubridge.exception;

public class EmployeeIDNotFoundException extends RuntimeException {

	public EmployeeIDNotFoundException(String msg) {
		System.out.println(msg);
	}
	
}
