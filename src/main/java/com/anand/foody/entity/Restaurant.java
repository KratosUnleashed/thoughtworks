package com.anand.foody.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.anand.foody.Constants.CUISINES;

@Component
public class Restaurant extends RestaurantKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2637394758233712230L;
	
	private List<Rating> ratings;
	private List<Dish> dishes;

	public List<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
	public Restaurant(long id, String name, List<CUISINES> categories, List<Dish> dishes) {
		super(id, name, categories);
		this.dishes = dishes;
	}
	public Restaurant() {
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
}
