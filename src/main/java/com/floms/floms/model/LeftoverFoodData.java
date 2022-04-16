package com.floms.floms.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("leftover_food_data")
public class LeftoverFoodData {
	String food_name;
	String food_description;
	String food_type;
	String food_category;
	String expiry_date;
	String food_image;
	int quantity;
	String created_by_id;
	String taken_by_id;
	String date;
	String time;
	String status;
	int activation;
	
	
	public LeftoverFoodData() {
		super();
	}
	
	public LeftoverFoodData(String food_name, String food_description, String food_type, String food_category,
			String expiry_date, String food_image, int quantity, String created_by_id, String taken_by_id, String date,
			String time, String status, int activation) {
		super();
		this.food_name = food_name;
		this.food_description = food_description;
		this.food_type = food_type;
		this.food_category = food_category;
		this.expiry_date = expiry_date;
		this.food_image = food_image;
		this.quantity = quantity;
		this.created_by_id = created_by_id;
		this.taken_by_id = taken_by_id;
		this.date = date;
		this.time = time;
		this.status = status;
		this.activation = activation;
	}





	@Override
	public String toString() {
		return "LeftoverFoodData [food_name=" + food_name + ", food_description=" + food_description + ", food_type="
				+ food_type + ", food_category=" + food_category + ", expiry_date=" + expiry_date + ", food_image="
				+ food_image + ", quantity=" + quantity + ", created_by_id=" + created_by_id + ", taken_by_id="
				+ taken_by_id + ", date=" + date + ", time=" + time + ", status=" + status + ", activation="
				+ activation + "]";
	}





	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public String getFood_description() {
		return food_description;
	}
	public void setFood_description(String food_description) {
		this.food_description = food_description;
	}
	public String getFood_type() {
		return food_type;
	}
	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}
	public String getFood_category() {
		return food_category;
	}
	public void setFood_category(String food_category) {
		this.food_category = food_category;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public String getFood_image() {
		return food_image;
	}
	public void setFood_image(String food_image) {
		this.food_image = food_image;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTaken_by_id() {
		return taken_by_id;
	}
	public void setTaken_by_id(String taken_by_id) {
		this.taken_by_id = taken_by_id;
	}
	public int getActivation() {
		return activation;
	}
	public void setActivation(int activation) {
		this.activation = activation;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCreated_by_id() {
		return created_by_id;
	}
	public void setCreated_by_id(String created_by_id) {
		this.created_by_id = created_by_id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
