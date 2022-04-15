package com.floms.floms.myexception;

public class DuplicateDataException extends RuntimeException {
	public DuplicateDataException(String message){
		super(message);
	}
}
