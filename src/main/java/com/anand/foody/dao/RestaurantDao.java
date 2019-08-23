package com.anand.foody.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.foody.db.MockDB;
import com.anand.foody.entity.Restaurant;

@Service
public class RestaurantDao {
	
	@Autowired
	MockDB db;

	public List<Restaurant> getAllRestaurants() {
		return db.getAllRestaurants();
	}

	public Restaurant getRestaurantById(long id) {
		return db.getRestaurantById(id);
	}
}
