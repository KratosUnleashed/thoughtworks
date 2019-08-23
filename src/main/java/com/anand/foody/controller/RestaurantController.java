package com.anand.foody.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.anand.foody.entity.Restaurant;
import com.anand.foody.service.RestaurantService;

@RestController(value = "foody")
public class RestaurantController {
	
	@Autowired
	RestaurantService service;
	
	@GetMapping("Restaurants")
	public List<Restaurant> getAllRestaurants() {
		return service.getAllRestaurants();
	}
	
	@GetMapping("Restaurant/{id}")
	public Restaurant getRestaurantById(@PathVariable long id) {
		return service.getRestaurantById(id);
	}
}
