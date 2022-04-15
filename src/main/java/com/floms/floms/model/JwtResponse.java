package com.floms.floms.model;

public class JwtResponse {
	String token;

	public JwtResponse() {
	
	}
	
	

	public JwtResponse(String token) {
		super();
		this.token = token;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}	
}
