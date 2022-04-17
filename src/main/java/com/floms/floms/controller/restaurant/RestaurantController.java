package com.floms.floms.controller.restaurant;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.floms.floms.database.restaurant_operations.RestaurantDataOperations;
import com.floms.floms.helper.ControllersPath;
import com.floms.floms.model.Response;
import com.floms.floms.model.RestaurantData;
import com.floms.floms.myexception.DuplicateDataException;

	
@RestController
@CrossOrigin("*")
public class RestaurantController {
	@Autowired
	RestaurantDataOperations restaurantDataOperations;
	
//  ## create new restaurant. 
	@RequestMapping(ControllersPath.CREATE_RESTAURANT_PROFILE_API_PATH)
	public ResponseEntity<?> createRestaurantProfile(@RequestBody String request)throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		RestaurantData restaurantData = mapper.readValue(request.getBytes(), RestaurantData.class);
		try {
			restaurantDataOperations.createNewRestaurant(restaurantData);
		}
		catch(DuplicateDataException d)
		{
			System.out.println("error: "+d);
			return ResponseEntity.ok(new Response(d.toString(),d.getMessage(),ControllersPath.CREATE_RESTAURANT_PROFILE_API_PATH,501));
		}
		catch(Exception ex)
		{
			System.out.println("error: "+ex);
			return ResponseEntity.ok(new Response(ex.toString(),ex.getMessage(),ControllersPath.CREATE_RESTAURANT_PROFILE_API_PATH,502));
		}
		
		return ResponseEntity.ok(new Response("no error","data created successfuly",ControllersPath.CREATE_RESTAURANT_PROFILE_API_PATH,1));
	}
	
	
	
}
