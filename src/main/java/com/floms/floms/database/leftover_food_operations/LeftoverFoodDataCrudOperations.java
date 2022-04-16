package com.floms.floms.database.leftover_food_operations;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.floms.floms.model.LeftoverFoodData;


public interface LeftoverFoodDataCrudOperations extends MongoRepository<LeftoverFoodData, String>{
	 
}
