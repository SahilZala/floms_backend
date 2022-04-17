package com.floms.floms.myexception;

public class BadCredentialException extends RuntimeException {

	public BadCredentialException(String msg)
	{
		super(msg);
	}
}
