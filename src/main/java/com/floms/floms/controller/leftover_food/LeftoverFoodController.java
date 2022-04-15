package com.floms.floms.controller.leftover_food;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.floms.floms.helper.ControllersPath;

@RestController
public class LeftoverFoodController {
	
	@RequestMapping(ControllersPath.CREATE_LEFTOVER_FOOD_API_PATH)
	public String createLeftoverFood(String data)
	{
		return "create left over api path";
	}
}
