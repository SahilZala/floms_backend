package com.floms.floms.config.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.floms.floms.database.restaurant_operations.RestaurantDataOperations;
import com.floms.floms.model.RestaurantData;

@Service
public class CustomeUserDetailsService implements UserDetailsService {
	
	@Autowired
	RestaurantDataOperations restaurantDataOperations;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		RestaurantData rd = restaurantDataOperations.findRestaurantDataWithId(userName);
		
		if(rd != null) {
			if(userName.equals(rd.getEmailid())) {
				return new User(rd.getEmailid(),rd.getPassword(),new ArrayList<>());
			}
			else {
				throw new UsernameNotFoundException("User not found !!");
			}
		}
		else {
			throw new UsernameNotFoundException("User not found !!");
		}
		
	}
	
	public UserDetails loadUserByUsernameWithPassword(String userName,String password) throws UsernameNotFoundException {
		RestaurantData rd = restaurantDataOperations.findRestaurantDataWithId(userName);	
		if(rd != null) {
			if(userName.equals(rd.getEmailid()) && password.equals(rd.getPassword())) {
				return new User(rd.getEmailid(),rd.getPassword(),new ArrayList<>());
			}
			else {
				throw new UsernameNotFoundException("User not found !!");
			}
		}
		else {
			throw new UsernameNotFoundException("User not found !!");
		}	
	}
}
