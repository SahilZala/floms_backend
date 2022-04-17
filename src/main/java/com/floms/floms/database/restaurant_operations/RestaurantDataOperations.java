package com.floms.floms.database.restaurant_operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.floms.floms.model.RestaurantData;
import com.floms.floms.myexception.DuplicateDataException;

@Configuration
public class RestaurantDataOperations {
	@Autowired
	private RestaurantDataCrudOperations restaurantDataCrudOperations;
	
	public void createNewRestaurant(RestaurantData restaurantData) throws DuplicateDataException,Exception {
		
		if(restaurantDataCrudOperations.findItemByName(restaurantData.getEmailid()) == null)
		{
			restaurantDataCrudOperations.save(restaurantData);
			System.out.println("log: restaurant created successfully");
		}
		else {
			throw new DuplicateDataException("duplicate restaurant data");
		}	
	}
	
	public RestaurantData findRestaurantDataWithId(String emailid)
	{
		RestaurantData restaurantData = restaurantDataCrudOperations.findItemByName(emailid);
		return restaurantData; 
	}
	
	
}
