package com.anand.foody.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.foody.dao.RestaurantDao;
import com.anand.foody.entity.Restaurant;

@Service
public class RestaurantService {

	@Autowired
	RestaurantDao dao;
	
	public List<Restaurant> getAllRestaurants() {
		return dao.getAllRestaurants();
	}

	public Restaurant getRestaurantById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
