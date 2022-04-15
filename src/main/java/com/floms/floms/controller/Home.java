package com.floms.floms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@RequestMapping("/welcome")
	public String welcome() {
		String text = "this is private page";
		
		System.out.println("log: home called");
		return text;
	}
}
	