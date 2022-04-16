package com.floms.floms.database.restaurant_operations;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.floms.floms.model.RestaurantData;

public interface RestaurantDataCrudOperations extends MongoRepository<RestaurantData, String> {
	 @Query("{emailid:'?0'}")
	 RestaurantData findItemByName(String name);
}
