package com.floms.floms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.floms.floms.config.service.CustomeUserDetailsService;

import com.floms.floms.helper.ControllersPath;
import com.floms.floms.helper.JwtUtil;
import com.floms.floms.model.JwtRequest;
import com.floms.floms.model.JwtResponse;
import com.floms.floms.model.Response;

@RestController
public class JwtController {
	
	@Autowired
	private AuthenticationManager authenticationManager; 

	@Autowired
	private CustomeUserDetailsService customeUserDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@RequestMapping(value = ControllersPath.GENERATE_RESTAURANT_TOKEN_API_PATH,method = RequestMethod.POST)
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest)
	{
		try {
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
		}
		catch(UsernameNotFoundException ex) {
			System.out.println("error: "+ex);
			return ResponseEntity.ok(new Response(ex.toString(),ex.getMessage(),ControllersPath.GENERATE_RESTAURANT_TOKEN_API_PATH,0));
		}
		catch(Exception ex) {
			System.out.println("error: "+ex);
			return ResponseEntity.ok(new Response(ex.toString(),ex.getMessage(),ControllersPath.GENERATE_RESTAURANT_TOKEN_API_PATH,0));
		}
		
		//final area
		try {
			UserDetails userDetails  = this.customeUserDetailsService.loadUserByUsernameWithPassword(jwtRequest.getUsername(),jwtRequest.getPassword());
			String token = this.jwtUtil.generateToken(userDetails);
			return ResponseEntity.ok(new JwtResponse(token));
		}
		catch(Exception ex)
		{
			System.out.println("error: "+ex);
			return ResponseEntity.ok(new Response(ex.toString(),ex.getMessage(),ControllersPath.GENERATE_RESTAURANT_TOKEN_API_PATH,0));
		}
		
		
		
	}
}
