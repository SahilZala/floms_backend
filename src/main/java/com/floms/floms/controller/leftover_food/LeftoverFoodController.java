package com.floms.floms.controller.leftover_food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.floms.floms.database.leftover_food_operations.LeftoverFoodDataOperations;
import com.floms.floms.helper.ControllersPath;
import com.floms.floms.model.LeftoverFoodData;
import com.floms.floms.model.Response;

@RestController
public class LeftoverFoodController {
	
	@Autowired
	LeftoverFoodDataOperations leftoverFoodOperations;
	
	@RequestMapping(ControllersPath.CREATE_LEFTOVER_FOOD_API_PATH)
	public ResponseEntity<?> createLeftoverFood(@RequestBody String request)
	{
		try {
			ObjectMapper mapper = new ObjectMapper();
			LeftoverFoodData leftoverFoodData = mapper.readValue(request.getBytes(), LeftoverFoodData.class);
			leftoverFoodOperations.createNewLeftoverFood(leftoverFoodData);
		}
		catch(RuntimeException d)
		{
			System.out.println("error: "+d);
			return ResponseEntity.ok(new Response(d.toString(),d.getMessage(),ControllersPath.CREATE_LEFTOVER_FOOD_API_PATH,501));
		}
		catch(Exception d)
		{
			System.out.println("error: "+d);
			return ResponseEntity.ok(new Response(d.toString(),d.getMessage(),ControllersPath.CREATE_LEFTOVER_FOOD_API_PATH,501));
		}
		
		return ResponseEntity.ok(new Response("no error","left over food created successfuly!",ControllersPath.CREATE_RESTAURANT_PROFILE_API_PATH,1));
	}
}
