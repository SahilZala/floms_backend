package com.floms.floms.controller.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.floms.floms.database.restaurant_operations.RestaurantDataOperations;
import com.floms.floms.helper.ControllersPath;
import com.floms.floms.model.Response;
import com.floms.floms.model.RestaurantLoginData;
import com.floms.floms.myexception.BadCredentialException;


@RestController
@CrossOrigin("*")
public class RestaurantLoginController {
	
	@Autowired
	RestaurantDataOperations restaurantDataOperations;
	
	@RequestMapping(ControllersPath.LOGIN_TO_RESTAURANT_API_PATH)
	public ResponseEntity<?> restaurantLogin(@RequestBody String request)
	{
		try {
			ObjectMapper mapper = new ObjectMapper();
			RestaurantLoginData restaurantLoginData = mapper.readValue(request.getBytes(), RestaurantLoginData.class);
			
			if(restaurantDataOperations.findRestaurantDataWithId(restaurantLoginData.getEmail()) == null)
			{
				throw new BadCredentialException("bad credential");
			}
			else {
				if(restaurantDataOperations.findRestaurantDataWithId(
						restaurantLoginData.getEmail()).getPassword().
						equals(restaurantLoginData.getPassword())) {
					return ResponseEntity.ok(new Response("no error","Valid user",ControllersPath.LOGIN_TO_RESTAURANT_API_PATH,1));
				}
				else
				{
					throw new BadCredentialException("wrong password");
				}
			}
		}
		catch(BadCredentialException ex)
		{
			System.out.println("error: "+ex);
			return ResponseEntity.ok(new Response(ex.toString(),ex.getMessage(),ControllersPath.LOGIN_TO_RESTAURANT_API_PATH,502));
		}
		catch(Exception ex)
		{
			System.out.println("error: "+ex);
			return ResponseEntity.ok(new Response(ex.toString(),ex.getMessage(),ControllersPath.LOGIN_TO_RESTAURANT_API_PATH,502));
		}
		
		
	}
}
