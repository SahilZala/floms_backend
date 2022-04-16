package com.floms.floms.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("restaurant_data")
public class RestaurantData {
	
	String restaurant_name;
	String restaurant_description;
	String address1;
	String address2;
	String city;
	String state;
	int zipcode;
	String country;
	String lat;
	String log;
	@Indexed(unique=true)
	String mobileno;
	@Indexed(unique=true)
	String emailid;
	String website;
	String username;
	String password;
	int activation;
	
	public RestaurantData(String restaurant_name, String restaurant_description, String address1, String address2,
			String city, String state, int zipcode, String country, String lat, String log, String mobileno,
			String emailid, String website, String username, String password, int activation) {
		super();
		this.restaurant_name = restaurant_name;
		this.restaurant_description = restaurant_description;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.lat = lat;
		this.log = log;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.website = website;
		this.username = username;
		this.password = password;
		this.activation = activation;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public RestaurantData() {
		super();
	}

	public String getRestaurant_name() {
		return restaurant_name;
	}

	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}

	public String getRestaurant_description() {
		return restaurant_description;
	}


	public void setRestaurant_description(String restaurant_description) {
		this.restaurant_description = restaurant_description;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getLat() {
		return lat;
	}


	public void setLat(String lat) {
		this.lat = lat;
	}


	public String getLog() {
		return log;
	}


	public void setLog(String log) {
		this.log = log;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getActivation() {
		return activation;
	}


	public void setActivation(int activation) {
		this.activation = activation;
	}
	
	
	
	
}
