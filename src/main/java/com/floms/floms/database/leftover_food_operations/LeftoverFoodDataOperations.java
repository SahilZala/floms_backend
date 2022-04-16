package com.floms.floms.database.leftover_food_operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floms.floms.model.LeftoverFoodData;

@Service
public class LeftoverFoodDataOperations {
	
	@Autowired
	LeftoverFoodDataCrudOperations leftoverFoodOperations;
	
	public void createNewLeftoverFood(LeftoverFoodData data) throws RuntimeException
	{
		leftoverFoodOperations.save(data);
	}
}
