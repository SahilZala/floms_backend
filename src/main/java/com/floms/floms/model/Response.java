package com.floms.floms.model;

public class Response {
	
	String error;
	String message;
	String path;
	int status;
	public Response(String error, String message, String path, int status) {
		super();
		this.error = error;
		this.message = message;
		this.path = path;
		this.status = status;
	}
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Response [error=" + error + ", message=" + message + ", path=" + path + ", status=" + status + "]";
	}
}
