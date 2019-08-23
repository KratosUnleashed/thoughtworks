package com.anand.foody.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.anand.foody.Constants.CUISINES;
import com.anand.foody.entity.Dish;
import com.anand.foody.entity.Restaurant;
import com.anand.foody.entity.Rating;

@Service
public class MockDB {
	
	private static List<Restaurant> restaurants = new ArrayList<>();
	private static List<Dish> dishes = new LinkedList<>();
	private static List<Rating> ratings = new LinkedList<>();
	
	static {
		dishes.add(new Dish(201, CUISINES.INDIAN, "Idly", "qq".getBytes()));
		dishes.add(new Dish(202, CUISINES.ASIAN, "Noodles", "ee".getBytes()));
		restaurants.add(new Restaurant(101, "Restaurant1", Arrays.asList(CUISINES.ASIAN, CUISINES.CONTINENTAL), 
				Arrays.asList(dishes.get(1))));
		restaurants.add(new Restaurant(102, "Restaurant2", Arrays.asList(CUISINES.INDIAN), 
				Arrays.asList(dishes.get(0))));
	}

	public List<Restaurant> getAllRestaurants() {
		return restaurants;
	}

	public Restaurant getRestaurantById(long id) {
		return restaurants.parallelStream().filter(r -> r.getId()==id).findFirst().get();
	}
	
	public void addRating(Rating review) {
		ratings.add(review);
	}
}
